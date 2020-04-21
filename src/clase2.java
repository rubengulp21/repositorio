
public class clase2 {

	public static void main(String[] args) {
		
			int []array =new int[4];
			array[0]=5;
			array[1]=6;
			array[2]=4;
			array[3]=5;
			System.out.println(metodo(array));
		

	}
	public static int metodo(int []array ) {
		int j=0;
		for (int i = 0; i < array.length; i++) {
			j+=array[i];
		}
		j=j/array.length;
		return j;
	}

}
