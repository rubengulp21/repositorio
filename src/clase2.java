/**
 * esta clase te muestra por consola la media de los numeros que hay en la array que le pasas por unico parametro
 * @author ruben
 *
 */
public class clase2 {
	/**
	 * este metodo es el principal y es donde esta instaciado el metodo(int array) visualiza el int que retorna el metodo anteriormente citado
	 * 
	 */
	public static void main(String[] args) {
		
			int []array =new int[4];
			array[0]=5;
			array[1]=6;
			array[2]=4;
			array[3]=5;
			System.out.println(metodo(array));
		

	}

	/** metodo calcula la media de los numeros de una array que le pasamos como unico parametro
	 * 
	 * @param array con los numeros 
	 * @return int 
	 */
	public static int metodo(int []array ) {
		int j=0;
		for (int i = 0; i < array.length; i++) {
			j+=array[i];
		}
		j=j/array.length;
		return j;
	}

}
