package com.generation.f20220602.Pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import com.generation.f20220602.Camioneta;
import com.generation.f20220602.Moto;
import com.generation.f20220602.VehiculoTerrestre;

public class PruebasVehiculos {

	
	@Test
	public void testVehiculo() {
		VehiculoTerrestre vehiculo = new VehiculoTerrestre();
		String prueba1 = vehiculo.acelerar();
		
		assertEquals("ChacaChacaChaca", prueba1);
		
	}
	
	@Test
	public void testCamioneta() {
		Camioneta camioneta = new Camioneta();
		String prueba2 = camioneta.acelerar();
		
		assertEquals("Bruuuum", prueba2);
		
	}
	
	@Test
	public void testMotomami() {
		Moto moto = new Moto();
		String prueba3 = moto.acelerar();
		
		assertEquals("Fiiiiuuummmmmm", prueba3);
		
	}
	
	@Test
	public void testMotoPata() {
		Moto moto = new Moto();
		Boolean prueba4 = moto.baseApoyo();
		
		assertEquals(true, prueba4);
		
	}
	
	@Test
	public void testCamiCalentito() {
		Camioneta camioneta = new Camioneta();
		Boolean prueba5 = camioneta.aireAcondicionado();
		
		assertEquals(true, prueba5);
		
	}

}
