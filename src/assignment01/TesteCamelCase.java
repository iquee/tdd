package assignment01;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TesteCamelCase {
	
	final private static String PALAVRA_TESTE_1 = "recupera10PrimeirosTDDCourseraX";
	final private static String PALAVRA_TESTE_2 = "10PrimeirosTDDCourseraX"; 
	final private static String PALAVRA_TESTE_3 = "meuTDD#2016"; 
	
	@Test
	public void testeConverterCamelCase(){
		CamelCase cm = new CamelCase();
		List<String> lista = cm.converterCamelCase(PALAVRA_TESTE_1);
		assertEquals(6, lista.size());
		assertEquals(Arrays.asList("recupera", "10", "primeiros", "TDD", "coursera", "X"), lista);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeInvalidoConverterCamelCase(){
		CamelCase cm = new CamelCase();
		cm.converterCamelCase(PALAVRA_TESTE_2);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeCaracterInvalidoConverterCamelCase(){
		CamelCase cm = new CamelCase();
		cm.converterCamelCase(PALAVRA_TESTE_3);
	}
}
