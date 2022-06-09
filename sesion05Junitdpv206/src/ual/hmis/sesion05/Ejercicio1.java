package ual.hmis.sesion05;

/* 1. Identifique las clases de equivalencia para el parámetro x en el siguiente método Java, e 
implemente los casos de prueba en JUnit necesarios para obtener un 100% de cobertura */

public class Ejercicio1 {
	
	public int transformar (int x) {
		int resultado = 0; 
		if (x % 2 == 0) // % Resto de una división entre enteros (mod)
		resultado = transformar (x/2);
		else if (x % 3 == 0)
		resultado = transformar (x/3);
		else if (x % 5 == 0)
		resultado = transformar (x/5);
		else return x;
		return resultado;
		}

}
