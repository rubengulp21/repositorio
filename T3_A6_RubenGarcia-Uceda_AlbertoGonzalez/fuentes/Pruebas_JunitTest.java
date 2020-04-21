import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Pruebas_JunitTest {
	int [] lista =new int [] {1,5,3,4,6};
	int [] listavacia =new int [5];
	@Test
	void test0() {
		int resultado=Pruebas_Junit.compara(lista,3);
		assertEquals(resultado,0);
	}
	@Test
	void test1() {
		int resultado=Pruebas_Junit.compara(lista,2);
		assertEquals(resultado,-1);
	}
	@Test
	void test2() {
		int resultado=Pruebas_Junit.compara(listavacia,0);
		assertEquals(resultado,0);
	}	
}
