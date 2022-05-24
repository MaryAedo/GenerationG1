package com.generation.f20220523;

public class Ejercicio1 {

	public static void main(String[] args) {
		// cálculo área y cálculo del perímetro
		//crear variables que permitan, a futuro, entregar valores de manera dinámica
		
		//variables estáticas
		//formular área triángulo (b*h) /2
		//impresión
		
		
		//fórmula perímetro circunferencia (2*PI*radio)
		//impresión
		
		//debe de haber una especie de "dame un número" y que se rellene en radio, pero no sé como
		//var num = parseInt (prompt ("Ingresa el valor del radio"));
		int dos = 2;
		float diametro [];//Deben asignar un valor
		double PI = 3.14f;//Valor de PI
		float radio = diametro / dos;//Formula de radio
		


		float formulaCirculo = (float) ((float) dos * PI * radio); //quizá se podría mantener el Pi como símbolo y no como número (depende de lo que diga el profe)

		
		int dos = 2;
        float diametro = 4;//Deben asignar un valor
        double PI = 3.1415;//Valor de PI
        float radio = diametro / dos;//Formula de radio


        float formulaCirculo = (float) (dos * PI * radio);
        System.out.println(formulaCirculo);

	}

}
