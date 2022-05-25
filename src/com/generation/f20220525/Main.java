package com.generation.f20220525;

public class Main {
	 public static void main(String[] args) {
		 int num1 = 2;
		 int num2 = 4;
		 int num3 = 6;
		 int num4 = 8;
		 int num5 = 10;
		 int num6 = 12;
		 int num7 = 14;
		 int num8 = 16;
		 int num9 = 18;
		 int num10 = 20;

		 int oddsAddition = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		 System.out.println ("La suma de los primeros 10 números impares es:" + oddsAddition);
		 //ARRIBA LE FALTAN 10 VARIABLES, le sumaría 10, para que se considere en cierta forma como los 20 primeros impares, o a cada numero par
		 //le sumaría 1 para que queden impares y luego los sumaría. Ahora si alguien quiere más o menos números
		 //impares, entonces haría una cajita donde poner la cantidad de números que hay y que eso se multiplique por 1
		 //luego esa a multiplicación se le suman los numeros
		    }

		 public static boolean isOdd (int numero) {
		 return numero % 2 == 0;
		    }
		    }

}
