package study_java;

public class Array7 {
	public static void main(String args[]) {
		int[] array1 = {1, 2, 3, 4};
		int[] array2 = new int[4];
		
		System.arraycopy(array1, 0, array2, 0,array1.length);
		
		System.out.println(array2[0]);
		
		array2[0] = 5;
		System.out.println(array1[0]);
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
