package study_java;

public class Array4 {
	public static void main(String args[]) {
		double average;
		double height[] = {172, 184, 160};
		
		average = (height[0] + height[1] + height[2]) / height.length;
		System.out.println("平均身長は：" + average);
	}
}
