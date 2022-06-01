package com.generation.f20220601.ejercicio;

public class Pisos extends Edificio{
	//atributo
	private int cantDeptos;
	private String tipoDepto;
	private int numPiso;
	
	//constructor
	public Pisos() {
		super();
	}

	public Pisos(int cantDeptos, String tipoDepto, int numPiso) {
		super();
		this.cantDeptos = cantDeptos;
		this.tipoDepto = tipoDepto;
		this.numPiso = numPiso;
	}

	//set y get
	public int getCantDeptos() {
		return cantDeptos;
	}

	public void setCantDeptos(int cantDeptos) {
		this.cantDeptos = cantDeptos;
	}

	public String getTipoDepto() {
		return tipoDepto;
	}

	public void setTipoDepto(String tipoDepto) {
		this.tipoDepto = tipoDepto;
	}

	public int getNumPiso() {
		return numPiso;
	}

	public void setNumPiso(int numPiso) {
		this.numPiso = numPiso;
	}

	@Override
	public String toString() {
		return "Pisos [cantDeptos=" + cantDeptos + ", tipoDepto=" + tipoDepto + ", numPiso=" + numPiso + "]";
	}
	
	
	
	

}
