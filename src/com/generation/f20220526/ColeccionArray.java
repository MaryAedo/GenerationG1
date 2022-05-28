package com.generation.f20220526;

import java.util.Arrays;

public class ColeccionArray {

	public static void main(String[] args) {
		//Array o conjunto de datos
		//en javaScript no se almacenan, en Java si
		//se debe definir el tipo de dato
		
		//Array estático o fijo
		String[] colores = {"red", "blue", "purple", "yellow", "orange", "black", "emerald"};
		Integer[] numerosPares = {2,4,6,8,10,12};
		int[] primerosNumeros = {1,2,3,4,5,6,7,8,9,0};
		
		//en todos los arreglos, la posicion inicial es 0
		System.out.println(colores[0]);
		System.out.println(numerosPares[0]);
		System.out.println(primerosNumeros[0]);
		
		//podemos acceder con: nombreArray[posicion] -> al elemento del arreglo en esa posicion
		System.out.println(numerosPares[3]);//8
		
		//numerosPares[7] = 14;//modificando el elemento en esa posicion
		//System.out.println(numerosPares[7]);//error fuera de indice
		//no podemos agregar por posicion si no existe el elemento
		
		System.out.println("tamaño array colores "+ colores.length);
		System.out.println("tamaño array numeros pares "+ numerosPares.length);
		
		System.out.println(colores.toString());
		System.out.println(numerosPares.toString());
		System.out.println(primerosNumeros.toString());
		
		System.out.println(Arrays.toString(colores));
		System.out.println(Arrays.toString(numerosPares));
		System.out.println(Arrays.toString(primerosNumeros));
		
		//recorrer un array
		for (int i = 0; i < primerosNumeros.length; i++) {
			System.out.println(primerosNumeros[i]);//si se elimina lo que está
			//al lado del print, se le borra y se anota el array sin salto de linea
		}	
		System.out.println("\n");
		//foreach (se apreta el ctrl + spacebar y se selecciona ese
		for (int elemento : primerosNumeros) {//{1,2,3,4,5,6,7,8,9,0};
			//int elemento = 0;
			System.out.println(elemento);
		}
		for (String color : colores) {//{"red", "blue", "purple", "yellow", "orange", "black", "emerald"};
			System.out.println(color + " ");
		}
		
	}

}


