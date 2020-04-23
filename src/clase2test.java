import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class clase2Test {

	@Test
	void test() {
		int [] array =new int [] {4,5,5,5,6};
		int resultado=clase2.metodo(array);
		assertEquals(resultado,5);
	}
	
	@Test
	void test1() {
		int [] lista =new int [3];
		int resultado=clase2.metodo(lista);
		assertEquals(resultado,0);
	}
}
