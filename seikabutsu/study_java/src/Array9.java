package study_java;

public class Array9 {
	public static void main(String args[]) {
		int[] array1 = {1, 2, 3, 4};
		int i;
		
		try {
			i = array1[5];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("添字が正しくありません");
		}
	}
}
