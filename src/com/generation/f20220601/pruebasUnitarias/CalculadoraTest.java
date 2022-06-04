package com.generation.f20220601.pruebasUnitarias;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42);//54
		
		//assertEquals(valorEsperado, resultado);
		assertEquals(54, resultado);
	}
	
	@Test
	public void testRestaNotNeg() {
		Calculadora calc = new Calculadora();
		int resultado = calc.resta(0, 0);
		
		assertTrue(resultado<= 0);
	}
	
	@Test
	public void testMultiplicacion() {
		Calculadora calc = new Calculadora();
		int resultado = calc.multiplicacion(0, 0);
		
		assertNotSame("0", resultado);
	}
	
	@Test
	public void testDivision() {
		Calculadora calc = new Calculadora();
		String resultado = calc.division(0, 0);
		
		assertEquals("No se puede dividir por cero", resultado);
		assertNotNull(resultado);
		assertNotEquals("0", resultado);
	}
	

	@Test
	public void testNumeroPar() {
		Calculadora calcPar = new Calculadora();
		String resultadoPar = calcPar.numerosPares(0);
		
		assertEquals("Tu numero es par", resultadoPar);
		
		
	}
	
}
