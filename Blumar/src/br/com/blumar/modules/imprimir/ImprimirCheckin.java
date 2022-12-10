package br.com.blumar.modules.imprimir;

import br.com.blumar.dtos.Hospedagem;

public class ImprimirCheckin implements Imprimir {

	@Override
	public void imprimir(Hospedagem hospedagem) {
		System.out.printf("%s CHECKIN %n", hospedagem.getHotel().getNome());
		System.out.printf("Responsável 		....... %s%n", hospedagem.getHospede().getNome());
		System.out.printf("Quarto      		....... %d%n", hospedagem.getNumQuarto());
		System.out.printf("Periodo     		....... %d%n", hospedagem.getHospede().getPeriodoDesejado());
		System.out.printf("Periodo Escolhido     	....... %2.2f%n%n", hospedagem.getHospede().getPeriodo().getPeriodoEscolhido());
		System.out.println("**************************************************");
	}
	
}
