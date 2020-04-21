

public class Pruebas_Junit {
	public static void main(String[] args) {
		int [] lista =new int [] {1,5,3,4,6};
		int numero=3;
		
		System.out.println(compara(lista,numero));
	}
	
	
	public static int compara(int [] lista,int numero) {
		for (int i = 0; i < lista.length; i++) {
			if(numero==lista[i]) {
				return 0;
			}
		
		}return -1;
		
	}
	
}


	

