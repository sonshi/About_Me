package study_java;

public class while1 {
	public static void main(String args[]) {
		int max = 100;
		int sum = 0;
		int i = 1;
		
		while(i <= max) {
			sum = sum + i;
			i++;
		}
		
		System.out.println(max + "までの総和:" + sum );
	}
}
