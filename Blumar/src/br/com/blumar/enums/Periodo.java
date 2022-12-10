package br.com.blumar.enums;

public enum Periodo {

	INDIVIDUAL(30.00),
	ACOMPANHANTE(50.00),
	CRIANCA(80.00);
	
	private double periodo;
	
	Periodo(double periodo) {
		this.periodo = periodo;
	}
	
	public double getPeriodoEscolhido() { return this.periodo; }
	
	
}
