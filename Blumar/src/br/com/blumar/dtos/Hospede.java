package br.com.blumar.dtos;

import br.com.blumar.enums.Periodo;

public class Hospede {

	private String nome;
	private int periodoDesejado;
	private Periodo periodo;
	

	public Hospede(String nome, int periodoDesejado, Periodo periodo) {
		this.nome = nome;
		this.periodoDesejado = periodoDesejado;
		this.periodo = periodo;
	}
	
	public Periodo getPeriodo() {
		return periodo;
	}

	public String getNome() {
		return nome;
	}

	public int getPeriodoDesejado() {
		return periodoDesejado;
	}
	
}
