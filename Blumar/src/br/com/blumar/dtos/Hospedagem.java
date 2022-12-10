package br.com.blumar.dtos;

import java.util.ArrayList;

import br.com.blumar.enums.Produtos;

public class Hospedagem {

	private int numQuarto;
	private Hotel hotel;
	private Hospede hospede;
	private ArrayList<Produtos> prodConsumidos = new ArrayList<>();
	
	public int getNumQuarto() {
		return numQuarto;
	}
	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}
	public ArrayList<Produtos> getProdConsumidos() {
		return prodConsumidos;
	}
	public void setProdConsumidos(ArrayList<Produtos> prodConsumidos) {
		this.prodConsumidos = prodConsumidos;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Hospede getHospede() {
		return hospede;
	}
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
	
	
}
