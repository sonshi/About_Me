package study_java;

public class weight4 {
	public static void main(String args[]) {
		final double BMI = 22;
		double weight, height;
		
		if (args.length == 0) {
			System.err.println("身長を最低１つ入力してください");
			System.exit(1);
		}
		
		for (int i = 0; i < args.length; i++) {
			height = Double.parseDouble(args[i]) / 100;
			weight = height * height * BMI;
			System.out.println("身長：" + args[i] + "cm" );
			System.out.println("体重：" + weight + "kg");
		}
	}
}
