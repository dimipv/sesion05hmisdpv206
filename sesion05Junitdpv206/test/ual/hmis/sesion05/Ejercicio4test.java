package ual.hmis.sesion05;
import ual.hmis.sesion05.Ejercicio4;
import java.util.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio4test {
	@Test
	public void testCalificacion() {
		Ejercicio4 ejer = new Ejercicio4();
		ejer.notas = new ArrayList<Double>();
		ejer.calificaciones = new ArrayList<String>();
		
		ejer.notas.add(12.2);
		ejer.notas.add(1.5);
		ejer.notas.add(4.6);
		ejer.notas.add(6.4);
		ejer.notas.add(5.7);
		ejer.notas.add(7.0);
		ejer.notas.add(10.0);
		ejer.notas.add(9.0);
		ejer.calculaCalificaciones(ejer.notas);
		
		//System.out.println(ejer.notas.get(0));
		
		assertEquals(ejer.calificaciones.get(0), "Error en la nota");
		assertEquals(ejer.calificaciones.get(1), "Suspenso");
		assertEquals(ejer.calificaciones.get(2), "Suspenso");
		assertEquals(ejer.calificaciones.get(3), "Aprobado");
		assertEquals(ejer.calificaciones.get(4), "Aprobado");
		assertEquals(ejer.calificaciones.get(5), "Notable");
		assertEquals(ejer.calificaciones.get(6), "Matricula");
		assertEquals(ejer.calificaciones.get(7), "Sobresaliente");
		
	}
	//public static void main(String[] args) {
		//Ejercicio4 ejer = new Ejercicio4();
		//ejer.notas = new ArrayList<Double>();
		//ejer.notas.add(12.2);
		//System.out.println(ejer.notas.get(0));
	//}
}
