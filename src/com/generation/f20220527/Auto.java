package com.generation.f20220527;

public class Auto {
	//clase es un modelo o prototipo
	//objeto, nace a partir de la clase, caracteristica o atributo
	//tiene metodos o funciones
	//algo concreto, lo convertimos en abstracto (no tangible)
	//tangible: usamos los 5 sentidos para describir
	
	//primero se crean los atributos, SIEMPRE RPIV
	//los constructores LOS HACE EL PROGRAMA con source
	//los setter y getters LOS HACE EL PROGRAMA con source también
	//por ultimo los metodos
	
	
	//atributo
	//accesador tipo nombreDelAtributo
	private String color;
	private String marca;
	private String modelo;
	private Double velocidad;
	
	
	//constructores:
	
	//constructor vacio
	public Auto () {
		
	}
	//constructor con parametros(source, generate constructor using fields) 
	public Auto(String color, String marca, String modelo, Double velocidad) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
	//accesadores y mutadores (get y set)
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
	//metodos o funciones
	
	public void aumentarVelocidad() {
		this.velocidad = 10d;//this se refiere al OBJETO/atributo 
		//en el que me posiciono, para que se le otorgue dicho valor
		
	}
	
	} 