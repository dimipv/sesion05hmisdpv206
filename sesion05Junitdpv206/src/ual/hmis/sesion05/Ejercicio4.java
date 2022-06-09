package ual.hmis.sesion05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio4 {
	ArrayList<Double> notas;
	ArrayList<String> calificaciones;
	
	public void calculaCalificaciones(List<Double> notas) {
		Iterator iter = notas.iterator();
		while(iter.hasNext()) {
			//calificacion((double) iter.next());
			calificaciones.add(calificacion((double) iter.next()));
		}
	}
	public String calificacion(double nota) {
		if(nota>=0 && nota<5) {
			return "Suspenso";
		}else if(nota>=5 && nota<7) {
			return "Aprobado";
		}else if(nota>=7 && nota<9) {
			return "Notable";
		}else if(nota>=9 && nota<10) {
			return "Sobresaliente";
		}else if(nota == 10) {
			return "Matricula";
		}
		return "Error en la nota";
	}
}