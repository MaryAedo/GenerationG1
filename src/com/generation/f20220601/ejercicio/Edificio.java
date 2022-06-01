package com.generation.f20220601.ejercicio;

public class Edificio {
	//atributo
	private String direccion;
	private Integer pisos;
	private String color;
	private Integer puntoDeAcceso;
	
	//constructores
	public Edificio() {
		super();
	}

	public Edificio(String direccion, Integer pisos, String color, Integer puntoDeAcceso) {
		super();
		this.direccion = direccion;
		this.pisos = pisos;
		this.color = color;
		this.puntoDeAcceso = puntoDeAcceso;
	}
	
	//get y set

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getPisos() {
		return pisos;
	}

	public void setPisos(Integer pisos) {
		this.pisos = pisos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPuntoDeAcceso() {
		return puntoDeAcceso;
	}

	public void setPuntoDeAcceso(Integer puntoDeAcceso) {
		this.puntoDeAcceso = puntoDeAcceso;
	}

	@Override
	public String toString() {
		return "Edificio [direccion=" + direccion + ", pisos=" + pisos + ", color=" + color + ", puntoDeAcceso="
				+ puntoDeAcceso + "]";
	}
	
	
	
	

}
