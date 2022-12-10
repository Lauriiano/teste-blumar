package br.com.blumar.modules.checkin;

import java.util.Map.Entry;

import br.com.blumar.dtos.Hospedagem;
import br.com.blumar.dtos.Hospede;
import br.com.blumar.dtos.Hotel;

public class CheckinUseCase {
	
	private int numQuarto = 0;

	public Hospedagem initCheckin(Hotel hotel, Hospede hospede) throws Exception {
		
		if(this.checkAvailability(hotel)) {
			Hospedagem hospedagem = new Hospedagem();
			hospedagem.setNumQuarto(this.numQuarto);
			hospedagem.setHotel(hotel);
			hospedagem.setHospede(hospede);
			return hospedagem;
		}
		throw new Exception("Todos os quartos estão lotados");
	}
	
	public boolean checkAvailability(Hotel hotel) {
		for(Entry<Integer, Boolean> quartos: hotel.qtdQuartos.entrySet() ) {
			if(quartos.getValue()) {
				hotel.inativarQuarto(quartos.getKey());
				this.numQuarto = quartos.getKey();
				return true;
			}
		}
		return false;
	}
	
}
