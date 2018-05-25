package study_java;

public class Array11 {
	public static void main(String args[]) {
		int array1[][] = new int[2][4];
		array1[0][1] = 3;
		array1[1][3] = 10;
		
		System.out.println("array1[0][1] = " + array1[0][1]);
		System.out.println("array1[1][3] = " + array1[1][3]);
		
		System.out.println("array1.length = " + array1.length);
		System.out.println("array1[1].length = " + array1[1].length);
	}
}
