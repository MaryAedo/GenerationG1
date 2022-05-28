package com.generation.f20220526;

public class FuncionesCalculadora {

	public static void main(String[] args) {
		//Math library
		
		//Exponent (potencia) (numero que se quiere elevar, exponente)
		double numeroElevado = Math.pow(4.5, 6);
		System.out.println(numeroElevado);
		
		//redondear al entero mayor
		double enteroMayor = Math.ceil(numeroElevado);
		System.out.println(enteroMayor);
		
		//redondear al entero menor
		double enteroMenor = Math.floor(numeroElevado);
		System.out.println(enteroMenor);
		
		//redondeo
		//no se redondea a la milésima ni nada de eso, redondea al entero
		double enteroRedondeado = Math.round(numeroElevado);
		System.out.println(enteroRedondeado);
		
		double num1 = 12;
		double num2 = 5;
		double div = num1/num2;
		System.out.println(div);
		
		//numeros aleatorios
		//Math.random() >= 0.0 y <1.0
		double aleatorio = Math.random();
		System.out.println(aleatorio);
		
		//numeros aleatorios entre 0 y 10
		double num010 = Math.random() * 10;
		System.out.println(num010);
		
		//numeros aleatorios entre 2 y 8
		//Math.random() * (max - min) + min;
		double num28 = 2 + (Math.random() * (8-2));
		System.out.println(num28);
		
		//numeros aleatorios entre -4 y 4
		double numNegPos = (Math.random() * (4 - -4))+ -4;
		System.out.println(numNegPos);
		
		//para poner un negativo, igual sería una opcion crear 
		//una variable llamada numeroNegativo y en vez de escribir
		//el numero como tal junto al Math.random, se anota la variable
		//todo el sistema sigue el orden PaPoMUDAS
		//the whole system follows PEMDAS order

	}

}
