package com.generation.f20220601.modelos;

public class Mascota {
	
	private String color;
	private String especie;
	private String pelaje;
	private String nombre;
	private float peso;
	private String sexo;
	
	public Mascota() {
		super();
	}

	public Mascota(String color, String especie, String pelaje, String nombre, float peso, String sexo) {
		super();
		this.color = color;
		this.especie = especie;
		this.pelaje = pelaje;
		this.nombre = nombre;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void hacerSonido() {
		System.out.println("Muuuuuu");
		
	}
	

}
