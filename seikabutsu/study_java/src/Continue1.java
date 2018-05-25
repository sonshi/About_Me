package study_java;

public class Continue1 {
	public static void main(String args[]) {
		final int MAX = 20;
		int[]random = new int[MAX];
		int index = 0;
		int num;
		
		while (true) {
			num = (int)(Math.random() * 100);
			if (((num % 4) == 0)) continue;
			random[index++] = num;
			System.out.println(num);
			
			if (index >= MAX) break;
		}
	}
}
