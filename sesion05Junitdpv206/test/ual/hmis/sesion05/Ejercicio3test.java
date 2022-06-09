package ual.hmis.sesion05;
import ual.hmis.sesion05.Ejercicio3;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio3test {
	@CsvSource({
		"41,password demasiado largo, true",
		"6,******, true",
		"1,password demasiado corto, true",
		"13,***********, false",
		"6,*****, false",
		"1,****, false",
		"-1,número erróneo,true"
		})
	
	@ParameterizedTest(name = "{index} => Con numero ({0}) y asteriscos ({1}) sale {2}")
	void testLogin_parametrized(String numero, String asteriscos, String result) {
	
		Ejercicio3 e3 = new Ejercicio3();

		assertEquals(Boolean.parseBoolean(result), asteriscos.equals
				(e3.devolverAsteriscos(Integer.parseInt(numero))));
	}
	
}