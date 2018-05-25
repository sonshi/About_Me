package study_java;

public class CharCode1 {
	public static void main(String args[]) {
		char c = 'あ';
		String s;
		
		s = Integer.toHexString(c);
		System.out.println(c + "の文字コード：" + s);
	}

}
