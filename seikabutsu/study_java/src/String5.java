package study_java;

public class String5 {
	public static void main(String args[]) {
		String s;
		int i = 45;
		
		s = Integer.toString(i, 2);
		System.out.println(s);
		
		s = Integer.toString(i, 16);
		System.out.println(s);
	}
}
