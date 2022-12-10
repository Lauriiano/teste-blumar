package br.com.blumar.modules.checkin;

import br.com.blumar.dtos.Hospedagem;
import br.com.blumar.dtos.Hospede;
import br.com.blumar.dtos.Hotel;

public class CheckinController {

	private Hotel hotel;
	
	public CheckinController(Hotel hotel) {
		this.hotel = hotel;
	}
	
	public Hospedagem initCheckin(Hospede hospede) throws Exception { 
		CheckinUseCase checkinUseCase = new CheckinUseCase();
		return checkinUseCase.initCheckin(this.hotel, hospede);
	}
	
}
