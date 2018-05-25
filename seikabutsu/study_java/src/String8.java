package study_java;

public class String8 {
	public static void main(String args[]) {
		char c1, c2, c3;
		String name = "山田虎之助";
		
		c1 = name.charAt(1);
		System.out.println(c1);
		
		c2 = name.charAt(name.length() - 1);
		System.out.println(c2);
		
		c3 = name.charAt(3);
		System.out.println(c3);
	}
}
