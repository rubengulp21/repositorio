/**
 * esta clase te muestra por consola la cantidad de numeros que acaban en 3 en la array que le pasas por parametro
 * @author ruben
 *
 */
public class clase1 {

	/** metodo calcula la cantidad de numeros que terminan en 3 de una array que le pasamos como unico parametro
	 * 
	 * @param array con los numeros 
	 * @return int 
	 */
	public static int  metodo(int[]array){
		int j=0;
		for (int i=0;i<array.length;i++) {
			if((array[i]%10)==3) {
				j++;
			}
		
		}
	return j;
	}
	/**
	 * este metodo es el principal y es donde esta instaciado el metodo(int array) visualiza el int que retorna el metodo anteriormente citado
	 * 
	 */
	public static void main (String [] args) {
		int []array =new int[4];
		array[0]=123;
		array[1]=13;
		array[2]=120;
		array[3]=3;
		System.out.println(metodo(array));
	}
}
