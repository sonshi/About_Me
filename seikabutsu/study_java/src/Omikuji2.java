package study_java;

public class Omikuji2 {
	static String[] kujis = {"大吉", "中吉", "凶"};
	
	static void omikuji() {
		System.out.println(kujis[(int)(Math.random() * kujis.length)]);
	}
	
	public static void main(String args[]) {
		System.out.println("今日の運勢");
		omikuji();
		System.out.println("明日の運勢");
		omikuji();
	}
}
