package com.generation.f20220531;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.generation.f20220531.manager.ClienteManager;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//arreglo de clientes
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		int opcion = 0;
		
		//intancia de cliente
		//por default el constructor asignado al objeto
		//para utilizar en la instancia, es el vacío
		Cliente cliente = new Cliente();
		cliente.setId(1234);
		cliente.setNombre("Fiorella");
		cliente.setRut("123456789-0");
		

		do {
			
		//excepciones
		Cliente clienteDatosDinamicos = new Cliente();
		
		System.out.println("Ingrese el id del Cliente");
		//Integer id = sc.nextInt();
		String idString = sc.nextLine();
		
		// TO handle exception
		try {
			//Integer id = null;
			Integer id = Integer.parseInt(idString);
			clienteDatosDinamicos.setId(id); 
			//cuando se aplica el null, se debe poner en la linea 29, dentro del id un +1 para comprobar errores
		sc.nextLine();
		
		
		System.out.println("Ingrese el nombre del Cliente");
		String nombre = sc.nextLine();
		clienteDatosDinamicos.setNombre(nombre);
		
		System.out.println("Ingrese el rut del Cliente");
		String rut = sc.nextLine();
		clienteDatosDinamicos.setRut(rut);
		
		System.out.println("Ingrese el correo del Cliente");
		String correo = sc.nextLine();
		clienteDatosDinamicos.setCorreo(correo);
		
		//Integer division = 100/0;
		//System.out.println(division);
		
	    }catch(ArithmeticException ae) {
		System.out.println("Error al dividir por cero");	
			
		}catch(NullPointerException npe){
			System.out.println("No se puede realizar la operacion matematica, un dato es nulo");
	    }catch(InputMismatchException ine){
	    	System.out.println("Error en el ingreso de un dato");
	    }catch(NumberFormatException nfe){
			System.out.println("No esta permitido el formado de letras como identificador"+nfe);
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error, contacte al administrador"+ e);
		}
		
		//agregar el cliente a la lista
		listaClientes.add(clienteDatosDinamicos);
		do {
		System.out.println("Desea ingresar un nuevo cliente? (1) Si (0) No");
		opcion = sc.nextInt();
		}while (opcion <0 || opcion >1);//este mini doWhile es para validar datos y que entren 0 y 1 como opciones
		sc.nextLine();
		
		}while(opcion == 1);

		//acceder al metodo de otra clase
		//debemos importarlo debido a que está en otro Package
		
		ClienteManager cm = new ClienteManager();//creamos la instancia
		cm.recorreArregloCliente(listaClientes);//llamo al metodo
		/*
		for (int i = 0; i < listaClientes.size(); i++) {
			System.out.println(listaClientes.get(i).getNombre());
			System.out.println(listaClientes.get(i).getId());
			System.out.println(listaClientes.get(i).getRut());
			System.out.println(listaClientes.get(i).getCorreo());
			System.out.println(listaClientes.get(i).toString());
		}
		
		for (Cliente cliente2 : listaClientes) {
			System.out.println(cliente2.toString());
		}*/
		
		
		
		//por cada objeto que se quiera crear, se deben hacer nuevas instancias
		//la base de datos servirá para almacenar objetos e información que contengan
		

	}

}
