package br.com.blumar;

import java.util.Map.Entry;

import br.com.blumar.dtos.Hospedagem;
import br.com.blumar.dtos.Hospede;
import br.com.blumar.dtos.Hotel;
import br.com.blumar.enums.Periodo;
import br.com.blumar.enums.Produtos;
import br.com.blumar.modules.checkin.CheckinController;
import br.com.blumar.modules.imprimir.Imprimir;
import br.com.blumar.modules.imprimir.ImprimirCheckin;
import br.com.blumar.modules.imprimir.ImprimirCheckout;

public class main {

	public static void main(String[] args) {

		
		Hotel hotel = new Hotel("Blumar Hotel");
		CheckinController checkin = new CheckinController(hotel);
		Hospedagem hospedagem = null;
		Imprimir voucher = null;
		Imprimir recibo = null;
		
		try {
			hospedagem = checkin.initCheckin(new Hospede("Acran Laureano", 2, Periodo.INDIVIDUAL));
			voucher = new ImprimirCheckin();
			voucher.imprimir(hospedagem);
			
			hospedagem.getProdConsumidos().add(Produtos.CERVEJA);
			hospedagem.getProdConsumidos().add(Produtos.AGUA);
			
			recibo = new ImprimirCheckout();
			recibo.imprimir(hospedagem);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			hospedagem = checkin.initCheckin(new Hospede("Marcos Teste", 2, Periodo.CRIANCA));
			voucher.imprimir(hospedagem);
			
			hospedagem.getProdConsumidos().add(Produtos.REFRI);
			
			recibo = new ImprimirCheckout();
			recibo.imprimir(hospedagem);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
