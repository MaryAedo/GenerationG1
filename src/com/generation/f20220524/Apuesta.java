package com.generation.f20220524;

import java.util.Scanner;

public class Apuesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc = new Scanner(System.in);

	        System.out.println("Ingrese su nombre y apellido");
	        String nombreApellido = sc.nextLine();
	        System.out.println("Ingrese su direccion");
	        String direccion = sc.nextLine();
	        System.out.println("Ingrese su numero de casa");
	        int numeroCasa = sc.nextInt();


	        System.out.println("Ingrese su edad");
	        int edad = sc.nextInt();

	        int MayoriaEdad = 18;
	        System.out.println("\nIngrese su saldo");
	        int saldo = sc.nextInt();
	        int minSaldo = 50000;
	        if (edad >= MayoriaEdad) {

	            System.out.println("Bienvenido!");


	        }else if (saldo >= minSaldo ){


	                System.out.println("Apueste lo que quiera");




	        } else {
	            System.out.println("PA FUERA");
	        }



	        int minApuesta = 10000;


	        if (saldo >= minSaldo ){

	            System.out.println("Apueste lo que quiera");

	        } else {
	            System.out.println("PA FUERA");
	        }

	        System.out.println("\nIngrese su apuesta, la minima apuesta hoy es de 10000");
	        int apuesta = sc.nextInt();

	        if (apuesta > minApuesta){

	            System.out.println("Disfrute su partida");

	        } else {
	            System.out.println("Ingrese un saldo mayor");
	        }



	    }
	
	}


