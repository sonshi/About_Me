package study_java;

public class OmikujiTest1 {
	static void omikuji() {
		String[] kuji = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		System.out.println(kuji[(int)(Math.random() * kuji.length)]);
	}
	
	public static void main(String args[]) {
		System.out.print("今日の運勢:");
		omikuji();
		System.out.print("明日の運勢:");
		omikuji();
	}
}
