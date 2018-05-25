package study_java;

public class Q4_1a {
	public static void main(String args[]) {
		 int index;
		 String[] omikuji = {"大吉", "中吉", "小吉", "凶", "大凶"};
		 
		 index = (int)(Math.random() * omikuji.length);
		 System.out.println(omikuji[index]);
	}
}
