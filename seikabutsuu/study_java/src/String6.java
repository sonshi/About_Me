package study_java;

public class String6 {
	public static void main(String args[]) {
		String s1 = "101";
		String s2 = "1.45e3";
		int i;
		double d;
		
		i = Integer.parseInt(s1);
		System.out.println(i);
		
		i = Integer.parseInt(s1, 2);
		System.out.println(i);
		
		d = Double.parseDouble(s2);
		System.out.println(d);
	}
}
