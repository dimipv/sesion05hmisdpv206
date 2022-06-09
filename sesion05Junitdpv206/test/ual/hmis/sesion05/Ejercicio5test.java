package ual.hmis.sesion05;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import ual.hmis.sesion05.Ejercicio5;

import org.junit.jupiter.api.Test;

class Ejercicio5test {

	@Test
	void testDuplicados() {
		ArrayList<String> A1 = new ArrayList<String>();
		ArrayList<String> A2 = new ArrayList<String>();
		ArrayList<String> A3 = new ArrayList<String>();
		Ejercicio5 ejer = new Ejercicio5();
		Set<String> hashSet;
		
		A1.add("Diego Miguel");
		A1.add("Francisco Linares");
		A1.add("Alvaro Suarez");
		A1.add("Alvaro Santiago");
		A1.add("Diego Miguel");
		A2.add("Cristian Casado");
		A2.add("Angel Gomez");
		
		A3 = ejer.listaOrdenadaEstudiantes(A1, A2);
		hashSet = new HashSet<String>(A3);
		
		assertEquals(hashSet.size(), A3.size());
	}
	@Test
	void testA1Vacio() {
		ArrayList<String> A1 = new ArrayList<String>();
		ArrayList<String> A2 = new ArrayList<String>();
		Ejercicio5 ejer = new Ejercicio5();
		
		A2.add("Cristian Casado");
		A2.add("Angel Gomez");
		Collections.sort(A2);
		
		assertEquals(A2, ejer.listaOrdenadaEstudiantes(A1, A2));
	}
	@Test
	void testA2Vacio() {
		ArrayList<String> A1 = new ArrayList<String>();
		ArrayList<String> A2 = new ArrayList<String>();
		Ejercicio5 ejer = new Ejercicio5();
		
		A1.add("Cristian Casado");
		A1.add("Angel Gomez");
		Collections.sort(A1);
		
		assertEquals(A1, ejer.listaOrdenadaEstudiantes(A1, A2));
	}
	@Test
	void testVacio() {
		ArrayList<String> A1 = new ArrayList<String>();
		ArrayList<String> A2 = new ArrayList<String>();
		Ejercicio5 ejer = new Ejercicio5();
		
		assertEquals(null, ejer.listaOrdenadaEstudiantes(A1, A2));
	}
}
