package study_java;

public class Exception3 {
	public static void main(String args[]) {
		int i ;
		String s = "10.1";
		
		try {
			i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
