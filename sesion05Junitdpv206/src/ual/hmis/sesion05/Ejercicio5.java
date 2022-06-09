package ual.hmis.sesion05;

import java.util.*;
import java.util.stream.*;

public class Ejercicio5 {
	public ArrayList<String> listaOrdenadaEstudiantes(ArrayList<String> A1, ArrayList<String> A2){
		ArrayList<String> ordenada = new ArrayList<String>();
		Set<String> hashSet = new HashSet<String>(ordenada);
		
		if(A1.isEmpty() && A2.isEmpty()) {
			return null;
		}
		if(A1.isEmpty()) {
			Collections.sort(A2);
			return A2;
		}
		if(A2.isEmpty()) {
			Collections.sort(A1);
			return A1;
		}else {
			for(String s1:A1) ordenada.add(s1);
			for(String s2:A2) ordenada.add(s2);
			ordenada.clear();
			ordenada.addAll(hashSet);
			Collections.sort(ordenada);
		}
			return ordenada;
	}
}
