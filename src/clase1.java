
public class clase1 {

	
	public static int  metodo(int[]array){
		int j=0;
		for (int i=0;i<array.length;i++) {
			if((array[i]%10)==3) {
				j++;
			}
		
		}
	return j;
	}
	public static void main (String [] args) {
		int []array =new int[4];
		array[0]=123;
		array[1]=13;
		array[2]=120;
		array[3]=3;
		System.out.println(metodo(array));
	}
}
