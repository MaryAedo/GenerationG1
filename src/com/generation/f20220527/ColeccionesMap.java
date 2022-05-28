package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {

	public static void main(String[] args) {
		//Colecciones Map
		//Pares clave <-> valor
		//HashMap<K, V> map = new HashMap<K, V>();
		//k = key o clave; V = value o valor
		//HashMap mapa = new HashMap ();
		
		//HashMap<String, String> objHashMap = new HashMap<>();
		HashMap objHashMap = new HashMap ();
		String nombre = "Marysabel";
		
		objHashMap.put("Nombre", nombre);
		objHashMap.put("ApellidoP", "Aedo");
		objHashMap.put("ApellidoM", "Moreno");
		objHashMap.put("Edad", "18");
		
		System.out.println("Elementos del mapa");
		System.out.println(objHashMap);
		
		//obtener un valor a traves de la clave
		System.out.println(objHashMap.get("ApellidoM"));
		
		//eliminar par
		objHashMap.remove("Edad");
		System.out.println(objHashMap);//imprimo el mapa
		
		//mostrar todas las llaves disponibles
		System.out.println(objHashMap.keySet());
		
		//mostrar todos los valores en el mapa
		System.out.println(objHashMap.values());
		
		//arrayList es un objeto
		ArrayList<String> vocales = new ArrayList <String>();
		vocales.add("a");
		vocales.add("e");
		vocales.add("i");
		vocales.add("o");
		vocales.add("u");
		
		//contexto: puse la V de vocales en Mayus y lo puso después de Nombre
		//pero con la v minuscula lo puso al final
		//no se ordenan por ingreso, le da lo mismo al HashMap
		//siempre y cuando le entregues el nombre correcto
		//para buscar el dato
		//pero si pone primero los mayuscula y luego los minuscula
		
		//objHashMap.put("Vocales", vocales);
		System.out.println(objHashMap);
		
		//si no encuentra la clave, retorna un null
		objHashMap.put("vocales",vocales);
		
		//crear menu de comida
		//solicitar al usuario que elija un plato
		//imprimimos el plato
		
		//como recorrer un HashMap
		for(Object clave : objHashMap.keySet()) {
			System.out.println("clave: "+clave +" - valor: "+objHashMap.get(clave)); 
		
		}

	}

}
