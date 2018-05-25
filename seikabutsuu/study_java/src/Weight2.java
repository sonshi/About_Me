package study_java;

public class Weight2 {
	public static void main(String args[]) {
		final double BMI = 22;
		double weight, heightM;
		double[] height = {172, 184, 160};
		
		for (int i = 0; i < height.length; i++) {
			heightM = height[i] / 100;
			weight = heightM * heightM * BMI;
			System.out.println("身長：" + height[i] + "cm");
			System.out.println("体重：" + weight + "kg" );
	   	}
	}
}
