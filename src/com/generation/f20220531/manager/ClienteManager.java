package com.generation.f20220531.manager;

import java.util.List;

import com.generation.f20220531.Cliente;

//logica de negocio
public class ClienteManager {
	
	//recorrer el arreglo e imprimir
	
	public void recorreArregloCliente(List<Cliente> listaClientes) {
		
		for (int i = 0; i < listaClientes.size(); i++) {
			System.out.println(listaClientes.get(i).getNombre());
			System.out.println(listaClientes.get(i).getId());
			System.out.println(listaClientes.get(i).getRut());
			System.out.println(listaClientes.get(i).getCorreo());
			System.out.println(listaClientes.get(i).toString());
		}
		
		/*for (Cliente cliente2 : listaClientes) {
			System.out.println(cliente2.toString());
		} */
		
	}

	@Override
	public String toString() {
		return "ClienteManager [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
