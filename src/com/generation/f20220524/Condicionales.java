package com.generation.f20220524;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		//usado para capturar el ingreso por consola
		Scanner sc = new Scanner(System.in);
		//validar la mayoría de edad
		//establecer punto crítico ->18 años
		
		int mayoriaEdad = 18;
		
		//solicitar el ingreso de edad
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();//estamos capturando el ingreso por consola y guardandolo en variable
		
		if(edad >= mayoriaEdad) {
			System.out.println("Usted es mayor de edad");
		}else {
			System.out.println("No esta permitido su ingreso");
		}
		//ingrese nombre con el String nombre = sc.nextLine();
		//solicitar todos los string: nombre, apellido, dirección
		//solicitar números: edad, n° direccion
		//ingresar saldo $$$
		
		//validar mayoria edad, saldo mayor a 50k
		//Si no cumple con ambas, no apuesta
		//cuanto quiere apostar? min 10k
	}

}
