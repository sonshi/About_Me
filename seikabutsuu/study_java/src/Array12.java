package study_java;

import java.lang.reflect.Array;

public class Array12 {
	public static void main(String args[]) {
		int array1[][] = { {0, 1},
							  {2, 3, 4, 5},
						      {6, 7} };
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println("");
		}
	}
}

