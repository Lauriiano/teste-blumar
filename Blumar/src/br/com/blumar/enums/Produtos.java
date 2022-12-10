package br.com.blumar.enums;

public enum Produtos {
	
	REFRI(3.00),
	CERVEJA(5.00),
	AGUA(2.00);
	
	private double valorProduto;
	
	Produtos(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	public double getValorProduto() { return this.valorProduto; }
	
}
