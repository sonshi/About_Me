package study_java;

public class DoWhile1 {
	public static void main(String args[]) {
		int i = 0;
		
		do {
			System.out.println("こんにちは");
			i++;
		} while (i < args.length);
	}
}
