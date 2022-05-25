package com.generation.f20220524;

public class CalculoPromedio {

	public static void main(String[] args) {
		//int cantidadNotas = 12;
		//arreglo array
		Integer[] notas = {-20,50,67,-99,10,-30,88,707,58,79,330,50};
		
		//variable acumuladora
		int sumaNotas = 0;//20
		int notasFueraDeRango = 0;
		
		//como recorrer el array de notas
		for (int i = 0; i < notas.length; i++) {//i=0
			//validar la nota (negativa o mayor a 100)
			if(notas[i] < 0 || notas[i] > 100) {
				System.out.println("la nota:" +notas[i] + " en la posicion "+ (i+1) + ", esta fuera de rango");
				notasFueraDeRango++;
			}
			sumaNotas = sumaNotas + notas[i];//accedemos a los valores notas[i]
		}
		if(notasFueraDeRango == 0) {//no hay notas fuera de rango
			
		}
		
		//promedio-> suma de todas las notas/cant notas;
		float promedio = sumaNotas / notas.length;
		
		//PUNTO CRÍTICO
		//0>=reprobado<=49; 50>=Aprobado<=100
		if(promedio >= 50 && promedio <= 100) {
			System.out.println("Estudiante aprueba");
			System.out.println("\nEl promedio es: "+ promedio);
		}else if (promedio >=0 && promedio <=49) {
			System.out.println("Estudiante reprueba");
			System.out.println("\nEl promedio es: "+ promedio);
		}else {
			System.out.println("Error en el calculo del promedio, por favor revise los valores ingresados");
		}

	}

}
