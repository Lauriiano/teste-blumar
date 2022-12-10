package br.com.blumar.modules.imprimir;

import br.com.blumar.dtos.Hospedagem;
import br.com.blumar.enums.Produtos;

public class ImprimirCheckout implements Imprimir {
	
	private double totalProdutos;

	@Override
	public void imprimir(Hospedagem hospedagem) {
		System.out.printf("%s CHECKOUT %n", hospedagem.getHotel().getNome());
		System.out.printf("Responsável 		....... %s%n", hospedagem.getHospede().getNome());
		System.out.printf("Quarto      		....... %d%n", hospedagem.getNumQuarto());
		System.out.printf("Periodo     		....... %d%n", hospedagem.getHospede().getPeriodoDesejado());
		System.out.printf("Periodo Escolhido     	....... %2.2f%n", hospedagem.getHospede().getPeriodo().getPeriodoEscolhido());
		for(Produtos produtos: hospedagem.getProdConsumidos()) {
			System.out.printf("%s     		....... %2.2f%n", produtos.toString() , produtos.getValorProduto());
			this.totalProdutos += produtos.getValorProduto();
		}
		System.out.printf("Total     		....... %2.2f%n%n", this.calcularTotal(hospedagem));
		System.out.println("**************************************************");
	}
	
	private double calcularTotal(Hospedagem hospedagem) {
		return hospedagem.getHospede().getPeriodo().getPeriodoEscolhido() * hospedagem.getHospede().getPeriodoDesejado() + this.totalProdutos;
	}
	
}
