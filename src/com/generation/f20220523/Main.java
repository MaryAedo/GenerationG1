package com.generation.f20220523;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		//Se define el tipo de dato al cual pertenecerá la variable
		//tipo de dato nombre_variable = asignación;
		String nombre = "Marysabel1234''\" \n\n\n 56789!.#$%%&/(";
		// el \n sirve para hacer saltos de linea, es de cir que se escriba abajo de algo
		//tipo el siguiente row de texto, cada uno de ellos sirve para saltar 1 row
		//si es uno nada más, te continúa la siguiente línea, si son dos, en vez
		// (si por ej) escribo en la 14, con 1 sigue en la 15, con 2 escribe en la 16
		
		//lo de abajo es syso (escrito) y se apreta control y barra espaciadora
		System.out.println(nombre);
		//esto de aquí arriba sirve para imprimir la variable que se menciona en los paréntesis
		
		//16bit (un solo carácter, ENTRE COMILLA SIMPLE)
		char letraChar = 'a';
				System.out.println(letraChar);
		//variables numéricas
		//32 bits
		int numeroInt = 24;
		System.out.println(numeroInt + 10);
		//int sirve sólo con números enteros!!, nada de decimales
		
		//8bits
		byte numeroByte = 100;
		System.out.println(numeroByte);
		
		//16bits
		short numeroShort = 32767;
		System.out.println(numeroShort);
		
		//64bits (2^63)
		long numeroLong = 1999999999;
		System.out.println(numeroLong);
		
		//float y double (aceptan decimales)
		
		
		//variable booleana (true o false)
		boolean acepta = true;//false
		
		String genero = "femenino cis";
		System.out.println(genero);
		
		String colorCabello = "castaño";
		System.out.println(colorCabello);
		
		boolean compromiso = true;
		if (compromiso == true) {
			System.out.println("Estoy comprometida");
		}else { 
			System.out.println("Uy, no lo estoy");
		}
		
		String poblacion = "Maipú";
		System.out.println(poblacion);
		
		int edad = 18;
		System.out.println(edad);
		
		String nombre1 = "Marysabel";
		System.out.println(nombre1);
		
		String ocupacion = "Estudiante de bootcamp";
		System.out.println(ocupacion);
		
		String poblacionn = "356 mts^2";
		String velocidad = "100 m/s";
		
		//Variables objeto
		System.out.println(velocidad.charAt(4));
		
		String curso = "G1";
		
		//los string se comparan con equals
		if(curso.equals("g1")) {
			System.out.println("iguales");
		} else {
			System.out.println("distintos");
		}
		
		if (curso.equalsIgnoreCase("g1")) {
			System.out.println("iguales");
		} else {
			System.out.println("distintos");
		}
		
		if (curso.toLowerCase().equals("g1")) {
			System.out.println("iguales");
		}
		
		if (curso.equals("g1".toUpperCase())) {
			System.out.println("iguales");
		}
		
		String curso2 = "";//vacío, empty
		String curso3 = null; //null
		//comparar un string con null, no se puede con el .equals
		if(null == curso3) {}
		
		//Float y Double
		//cast es convertir un dato a otro tipo de dato
		float altura = (float) 1.63;//1.63f;
		
		float peso = 78;
		//una mayúscula en la f de float hace que se considere como una variable objeto
		
		Float gravedad = Float.parseFloat("9.8");
		
		//Parse: convertir String a un tipo de numero
		Integer.parseInt("23");
		Long.parseLong("172373647");
		Float.parseFloat("847757.6");
		Double.parseDouble("1378299.88");
		
		//ejercicio, convertir primitiva a objeto y viceversa
		float num1 = 12.8f;
		
		//conversión de datos
		//Automática
		//byte>short>int>long>float>double
		
		int num4 = 18;
		float num4f = num4;
		System.out.println(num4 + " " + num4f);
		
		//Manual
		//double>float>long>int>...
		/*double peso2 = 75.9;
		float peso2f = (float) peso2;
		sirve para convertir de primitivo a primitivo, si uno de ellos es objeto, se va a la v*/
		
		Double peso2 = 75.9;
		float peso2PF = peso2.floatValue();
		Float peso2F = peso2PF;
		//Float peso2F = peso2.floatValue();
		
		float numPrimitivo = 123.4f;
		Float numObjeto = 123.45f;
		
		//de float a int, SE PIERDEN LOS DECIMALES
		//Float a Integer, SE PIERDEN LOS DECIMALES
		
		//+ - * / % (operadores)
		//== != > >= < <= (comparación)
		int dos = 2;
		int tres = 3;
		
		if( iva == (3 + dos) ) {
			
		}
		
	}
}
