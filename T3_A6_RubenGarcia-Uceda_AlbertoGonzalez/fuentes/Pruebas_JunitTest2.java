import static org.junit.Assert.*;

import org.junit.Test;
public class Pruebas_JunitTest2 {

	@Test
	public void test() {
		int [] lista =new int []{1,5,3,4,6};
		int numero=3;
		
		assertEquals(0,Pruebas_Junit.compara(lista, numero));
		}
	@Test
	public void test2() {
		int [] lista =new int [] {1,5,3,4,6};
		int numero=7;
		
		assertEquals(-1,Pruebas_Junit.compara(lista, numero));
		}
	@Test
	public void test3() {
		int [] lista =new int [5];
		int numero=7;
		
		assertEquals(-1,Pruebas_Junit.compara(lista, numero));
		}
}
