package study_java;

import java.util.Arrays;
public class Array10 {
	public static void main(String args[]) {
		int[] array1 = {8, 2, 13, 4};
		
		Arrays.sort(array1);
		System.out.println("最小値：" + array1[0]);
		System.out.println("最大値：" + array1[array1.length - 1]);
	}
}
