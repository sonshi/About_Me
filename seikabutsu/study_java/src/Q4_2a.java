package study_java;

public class Q4_2a {
	public static void main(String args[]) {
		int sum = 0;
		int num = Integer.parseInt(args[0]);
		
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println(args[0] + "までの総和：" + sum);
	}
}
