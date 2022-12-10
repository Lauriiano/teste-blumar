package br.com.blumar.dtos;

import java.util.HashMap;
import java.util.Map;

public class Hotel {

	private double diariaIndividual = 30.00;
	private double diariaAcompanhante = 50.00;
	private double diariaCrianca = 80.00;
	private String nome = "Blumar Hotel";
	public Map<Integer, Boolean> qtdQuartos = new HashMap<Integer, Boolean>();
	
	public Hotel(String nome) {
		this.nome = nome;
		this.qtdQuartos.put(101, true);
		this.qtdQuartos.put(102, true);
//		this.qtdQuartos.put(103, true);
//		this.qtdQuartos.put(104, true);
//		this.qtdQuartos.put(105, true);
//		this.qtdQuartos.put(106, true);
	}
	
	public double getDiariaIndividual() {
		return diariaIndividual;
	}
	
	public double getDiariaAcompanhante() {
		return diariaAcompanhante;
	}
	
	public double getDiariaCrianca() {
		return diariaCrianca;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Map<Integer, Boolean> getQtdQuartos() {
		return qtdQuartos;
	}
	
	public void inativarQuarto(int key) {
		this.qtdQuartos.put(key, false);
	}
	
}
