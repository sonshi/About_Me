package study_java;

public class Array6 {
	public static void main(String args[]) {
		int[] array1 = {1, 2, 3, 4};
		int[] array2;
		
		array2 = array1;
		System.out.println(array2[0]);
		
		array2[0] = 5;
		System.out.println(array1[0]);
	}
}
