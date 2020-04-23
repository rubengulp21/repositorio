/**
 * essta clase hace distintas pruebas con la clase2.java
 * @author ruben
 *
 */


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class clase2Test {
	/**
	 * este metodo comprueba que se realiza bien la media 
	 */
	@Test
	void test() {
		int [] array =new int [] {4,5,5,5,6};
		int resultado=clase2.metodo(array);
		assertEquals(resultado,5);
	}
	/**
	 * este metodo comprueba que el parametro array no este vacio
	 */
	@Test
	void test1() {
		int [] lista =new int [3];
		int resultado=clase2.metodo(lista);
		assertEquals(resultado,0);
	}
}
