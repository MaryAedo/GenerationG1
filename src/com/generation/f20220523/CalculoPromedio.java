package com.generation.f20220523;

public class CalculoPromedio {

	public static void main(String[] args) {
		//int cantidadNotas = 12;
		//arreglo array
		Integer[] notas = {20,50,67,99,10,0,88,77,58,79,33,50};
		
		//promedio-> suma de todas las notas/cant notas;
		
		int sumaNotas = 0;
		//como recorrer el array de notas
		for (int i = 0; i < notas.length; i++) {//i=0
			sumaNotas = sumaNotas + notas[i];
			
		}
		System.out.println("suma de notas: " + sumaNotas);
		
		//promedio;
		float promedio = sumaNotas / notas.length;
		/* TODO validar el orden >= */
		//101
		if(promedio >= 50 && promedio <= 100) {
			
		}else {
			
		}

	}

}
