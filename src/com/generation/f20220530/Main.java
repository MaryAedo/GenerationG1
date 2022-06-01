package com.generation.f20220530;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.generation.f20220527.Alumno;
import com.generation.f20220531.Cliente;

public class Main {

	public static void main(String[] args) {
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		//list es una interfaz; arrayList es una clase
		//las interfaces solo definen los metodos, es solo la estructura
		//en cambio el arrayList es una clase y tiene atributos, funciones,
		//metodos, etc y va mucho mas allá de la definicio e implementacion de ella
		//instancia de una clase
		//es una definicion de un objeto
		//(no pescar tanto porque no lo supe escribir bien)se puede invocar desde otra clase, no necesariamente de la madre
		
		//esto de alumno alumno = new alumno es UNA INSTANCIA DE CLASE que creamos recién
		//si no agregamos constructores, por default se usa el vacio
		Alumno alumno = new Alumno(); //con estos parentesis se llama
		//al constructor VACIO, sirve para asignarle valores
		//a los atributos
		Alumno alumno2 = new Alumno("Marysabel","Aedo",18,"G1");
		//el constructor con parámetros, cuando se llena
		//sirve para asignarle valores por default
		
		
		listaAlumnos.add(alumno);
		listaAlumnos.add(alumno2);
		//al get tambien se le llama accesador 
		//el get se usa para obtener el (valor que
		//debiese tener asignado)/atributo mi variable
		//atributo es variable del objeto
		alumno.setNombre("UyMary");
		
		System.out.println(alumno.getNombre());//imprime null
		System.out.println(alumno2.getNombre());
		
		//setter sirve para cambiar o mutar el valor de una variable
		alumno.setNombre("Mary");
		System.out.println(alumno.getNombre());
		
		System.out.println(alumno2.toString());
		
		for (int i = 0; i < listaAlumnos.size(); i++) {
			System.out.println(listaAlumnos.get(i).getNombre());
			System.out.println(listaAlumnos.get(i).getApellido());
			System.out.println(listaAlumnos.get(i).toString());
		}
		
		for (Alumno objetoAlumno : listaAlumnos) {
			//System.out.println(objetoAlumno.getNombre());
			//System.out.println(objetoAlumno.getCurso());
			System.out.println(objetoAlumno.toString());
			}
			
		
		
		//********************
		//crear tantas instancias como miembros del equipo hay
		//luego hay que imprimirlos
		
		
		 Alumno alumno01 = new Alumno("Luis","Mejias",28,"G1");
	        Alumno alumno02 = new Alumno("Leonardo","Utreras",26,"G1");
	        Alumno alumno03 = new Alumno("Mary","Aedo",18,"G1");
	        Alumno alumno04 = new Alumno("Francisco","Perez",26,"G1");
	        Alumno alumno05 = new Alumno("Francisco","Cid",25,"G1");
	        Alumno alumno06 = new Alumno("Ignacio","Romero",23,"G1");
	        
	        System.out.println("~~~~~~~< Este es el >~~~~~~~");
	        System.out.println(" ~~~~~~~~< Grupo 1 >~~~~~~~~");
	        System.out.println( "    " + alumno01.getNombre() + " " + alumno01.getApellido() + " " + alumno01.getEdad() + " " + alumno01.getCurso());
	        System.out.println( "  " + alumno02.getNombre() + " " + alumno02.getApellido() + " " + alumno02.getEdad() + " " + alumno02.getCurso());
	        System.out.println( "     " + alumno03.getNombre() + " " + alumno03.getApellido() + " " + alumno03.getEdad() + " " + alumno03.getCurso());
	        System.out.println( "   " + alumno04.getNombre() + " " + alumno04.getApellido() + " " + alumno04.getEdad() + " " + alumno04.getCurso());
	        System.out.println( "    " + alumno05.getNombre() + " " + alumno05.getApellido() + " " + alumno05.getEdad() + " " + alumno05.getCurso());
	        System.out.println( "   " + alumno06.getNombre() + " " + alumno06.getApellido() + " " + alumno06.getEdad() + " " + alumno06.getCurso());
	        System.out.println("~~~~~~~< Muchas gracias >~~~~~~~");
	        System.out.println("~~~~~~~< por su atencion >~~~~~~~");
	        
	        
	        Cliente cliente = new Cliente();
	        }
	}


