package study_java;

public class Omikuji1 {
	public static void main(String args[]) {
		int index;
		String[] omikuji = {"大吉", "中吉", "小吉"};
		
		//0から2までの乱数を生成する。
		index = (int)(Math.random() * 3);
		System.out.println(omikuji[index]);		
	}
}
