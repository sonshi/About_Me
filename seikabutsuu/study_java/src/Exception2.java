package study_java;

public class Exception2 {
	public static void main(String args[]) {
		int i;
		String s = "10.1";
		
		try {
			i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println(s + "を変数に変換できません");
		}
	}
}
