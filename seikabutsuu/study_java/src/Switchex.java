package study_java;

public class Switchex {
	public static void main(String args[]) {
		
		switch((int)(Math.random() * 3)){
			case 0:
				System.out.println("大吉");
			case 1:
				System.out.println("中吉");
			case 2:
				System.out.println("凶");
		}
	}
}
