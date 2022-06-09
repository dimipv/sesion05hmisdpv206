package ual.hmis.sesion05;

public class Ejercicio3 {
	public String devolverAsteriscos(Integer numero) {
		String result = "";
		if(numero<0)
			return "número erróneo";
		if(numero < 5) {
			return "password demasiado corto";
		}
		if(numero>12) {
			for(int i = 0; i<12; i++)
				result+="*";
		}
		if(numero>40) {
			return "password demasiado largo";
		}
		else {
			for(int i = 0; i<numero; i++)
				result+="*";
		}
		return result;
	}
}
