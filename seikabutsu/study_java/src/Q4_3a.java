package study_java;

public class Q4_3a {
	public static void main(String args[]) {
		final double BMI = 22;
		double weight, height;
		
		try {
			for (int i = 0; i < args.length; i++) {
				height = Double.parseDouble(args[i]) / 100;
				weight = height * height * BMI;
				System.out.println("身長：" + args[i] + "cm");
				System.out.println("体重：" + weight + "kg" );
			}
		}catch(NumberFormatException e) {
			System.out.println("引数が正しくありません");
		}
	}
}
