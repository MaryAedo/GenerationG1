package com.generation.f20220601.ejercicio;

public class Depto extends Pisos{
	private String nombreDueno;
	private int numPiezas;
	
	public Depto() {
		super();
	}

	public Depto(String nombreDueno, int numPiezas) {
		super();
		this.nombreDueno = nombreDueno;
		this.numPiezas = numPiezas;
	}

	public String getNombreDueno() {
		return nombreDueno;
	}

	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}

	public int getNumPiezas() {
		return numPiezas;
	}

	public void setNumPiezas(int numPiezas) {
		this.numPiezas = numPiezas;
	}

	@Override
	public String toString() {
		return "Depto [nombreDueno=" + nombreDueno + ", numPiezas=" + numPiezas + "super.toString()]";
	}

}



//override sirve para imprimir
	//super recorre hacia atras