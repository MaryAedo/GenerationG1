package com.generation.f20220526;

import java.util.Scanner;

public class Funciones {

	public static void main(String[] args) {
		//Funciones
		//4 tipos de funciones
		//2 que retornan
		//2 que no retornan
		//retornar significa que nos entregue algún valor
		//void significa que la funcion no retornara nada
		//las funciones de tipo void SOLO ejecutan codigo
		//nombre_funcion se escribe con minuscula la primera letra
		//las funciones son los metodos
		//se debe definir el tipo de dato que se recibira
		//se permiten tanto datos primitivos como objeto
		/*1.- Funcion void que recibe datos y ejecuta código
		 * 2.- Funcion void que no recibe datos, solicita entrada de datos y ejecuta código
		 * 3.- Funcion que retorna dato
		 * 4.- Funcion que recibe datos y retorna dato*/
		//el estatic permite que podamos llamar la funcion sin crear una instancia
		//no puede CREAR una funcion o metodo dentro de otro metodo
		//pero si se puede LLAMAR a otro metodo
		
		saludo();//llamado al metodo o funcion
		calculoSumaPares(true, 23, "33", 44l, "Sumar");
		
		//crear una variable que capturara el valor de retorno
		//y luego imprimirlo
		//como int e Integer son "familiares cercanos", entonces no hay problema
		//en la conversion de primitivo a objeto
		int edad = obtenerEdad();
		System.out.println((edad));
		
		//tiene que ser capturado en el mismo tipo d edato
		//en este caso un boolean, se acepta primitivo y objeto
		Boolean mayorOMenor = validarMayorEdad(edad);
		
		if(mayorOMenor) {
			System.out.println("Puede ingresar al curso");
		}else {
			System.out.println("No tiene la edad suficiente para acceder al curso");
		}

	}
	//una funcion de tipo publica significa que se puede
	//acceder a ella desde cualquier parte
	//public es el tipo de nivel de acceso
	//existe public, private y protected
	//accesador tipo_de_retorno nombre_funcion(parametros_a_recibir)
	//no existe cantidad maxima de parametros, pero sí, siempre
	//deben definirse segun el tipo de dato que recibiran
	public static void calculoSumaPares(boolean verdad, int numero1, String numero2, Long numero3, String accion) {
		Integer num2 = Integer.parseInt(numero2);
		System.out.println(numero1 + numero3 + num2);
	}
	
	//static nos permite acceder al metodo (funcion)
	public static void saludo () {
		//solicitar el ingreso de datos
		System.out.println("Good Morning");
	}
	
	//funciones que retornan UN tipo de dato
	//esto le pide el tipo de dato que debe retornar
	public static Integer obtenerEdad() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese edad");
		Integer edad = scanner.nextInt(); //18;
		return edad;//retornar el contenido de la variable
		
	}
	
	public static Boolean validarMayorEdad(Integer edad) {
		if(edad>= 18) {
			System.out.println("Es mayor de edad");
			return true;
		}else {
			System.out.println("Es menor de edad");
			return false;
		}
	}

}
