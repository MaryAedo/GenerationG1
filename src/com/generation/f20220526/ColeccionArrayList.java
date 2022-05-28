package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionArrayList {

	public static void main(String[] args) {
		//ArrayList DINAMICOS
		//array list se importa, por eso antes aparece un error
		ArrayList<String> colores = new ArrayList<String>();
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();
		
		//agregar un elemento a la lista
		colores.add("ginger");
		colores.add("navy blue");
		
		//si existe un elemento en esa posicion lo desplaza a la derecha
		colores.add(2,"lime green");
		
		//imprimir el contenido
		System.out.println(colores);
		
		//acceder a un elemento
		System.out.println(colores.get(2));
		
		//tamaño del arreglo size()
		System.out.println(colores.size());
		//length para los estáticos, size para los dinámicos
		//en los dinamicos funciones, en los estaticos corchetes
		colores.set(1, "sky blue");
		System.out.println(colores);
		
		//quitar un elemento arrayName.remove(position)
		colores.remove(1);
		System.out.println(colores);
		
		//recorrer el arreglo
		for (int i = 0; i < colores.size(); i++) {
			System.out.println(colores.get(i));
		}
		
		//lo que hace es ordenar el arreglo de forma ascendente
		//no es un cambio temporal, es permanente
		//es desde aquí hacia abajo
		Collections.sort(colores);
		System.out.println(colores);
			
		//quitar todos los elementos
		colores.clear();
		System.out.println(colores);
		
		
		numerosPares.add(14);
		numerosPares.add(27);
		numerosPares.add(4);
		numerosPares.add(38);
		numerosPares.add(95);
		numerosPares.add(11);
		numerosPares.add(9);
		System.out.print(numerosPares + " ");
		System.out.println();
		Collections.sort(numerosPares);
		System.out.println(numerosPares + " ");
		
		System.out.println();
		//reverse por si solo no ordena descendentemente
		//pero sí se ordena de esa forma luego de ordenarlo ascendentemente con sort
		Collections.reverse(numerosPares);
		System.out.println(numerosPares + " ");
	}
	
}
