package com.generation.f20220525;

import java.util.Scanner;

public class TareaSeguros {

	public static void main(String[] args) {
		//Segun la edad se calcula el tipo de prima que corresponde
		//solicitar ingreso edad
		//calcular usando switch
		//calcular la prima de seguro
		//ingresar otro dato de edad
		//el usuario debe usar 0 para salir
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();//capturando el ingreso por consola
		boolean errorIngreso = false;
		
		if(edad >= 18) {
			errorIngreso = true;
		} 
		while(errorIngreso) { 
			System.out.println("Seleccione su rango etario");
			System.out.println(" (0) salir \n (1) 18 a 29 \n (2) 30 a 49 \n (3) 50 a 69 \n (4) igual o mayor a 70");
			edad = sc.nextInt();
			//si se comenta por debajo, desde el if hasta el
			//syso fuera de rango, entonces se activa el bucle de seleccionar una opcion
			if(edad < 18 || edad > 0) {
				errorIngreso = true;
			}else {
				errorIngreso= false;
			}
		
		
		//System.out.println("Fuera de rango");
		
		
		switch (edad) {
		case 1://rango etario que paga 500USD
				// accion para la opcion 1
				System.out.println("Su prima es de: 500 USD ");
			break;
		case 2: //rango etario que paga 400USD
			System.out.println("** Resta");
			break;
		case 3: //rango etario que paga 250USD
			System.out.println("** Multiplicacion");
			break;
		case 4://rango etario que paga 100USD
			System.out.println("** Division");
			break;
		default:
			System.out.println("Regrese pronto");//en vez de regrese pronto debería
			//existir la opcion de volver a ingresar la edad, otra vez
			break;
		      }
		}

	}

}
