package com.generation.f20220601;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Mishi;
import com.generation.f20220601.modelos.Perro;

public class Main {

	public static void main(String[] args) {
		//herencia
		
		Mascota mascota = new Mascota();
		mascota.setColor("gris");
		mascota.setNombre("Tom");
		
		Perro perro = new Perro();
		perro.setColor("RedFaund");
		perro.setNombre("Ayun");
		
		Gato gato = new Gato();
		gato.setEspecie("Felino");
		gato.setPelaje("pelo");
		gato.setPeso(3);
		
		//System.out.println(gato.toString());
		
		Mishi mishi = new Mishi(true);
		mishi.setColor("amarillo");
		System.out.println(mishi.toString());
		
		//polimorfismo:
		List<Mascota> listaMascotas = new ArrayList<Mascota>();
		Mascota regalon = new Mascota("Negro", "Cannes", "Pelo", "Firulais", 1.5f, "Macho");
		listaMascotas.add(regalon);
		
		//instancia donde un padre se comporta como hijo
		Mascota felix = new Gato();
		felix.setNombre("Felix");
		felix.setColor("Negro");
		felix.setPeso(3);
		listaMascotas.add(felix);
		
		Mascota chocolo = new Perro();
		chocolo.setNombre("Chocolo");
		chocolo.setColor("Cafe");
		chocolo.setPeso(10);
		listaMascotas.add(chocolo);
		
		System.out.println("********");
		
		regalon.hacerSonido();//llamando al metodo en Mascotas
		felix.hacerSonido();
		chocolo.hacerSonido();
		System.out.println("*********");
		
		//recorrer el arreglo
		for (Mascota mascota2 : listaMascotas) {
			mascota2.hacerSonido();
		}
		
		//transformar el objeto generico a uno especifico
		Perro perroChocolo = (Perro) chocolo;
		perroChocolo.setCantPaseos(6);
		
	}

}
