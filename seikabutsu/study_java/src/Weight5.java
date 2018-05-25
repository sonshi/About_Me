package study_java;

import java.io.*;
public class Weight5 {
	public static void main(String args[]) {
		final double BMI = 22;
		double weight, height;
		BufferedReader br;
		br = (new BufferedReader(new InputStreamReader(System.in)));
		
		try {
			System.out.println("身長(cm)を入力してください：");
			String ans = br.readLine();
			height = Double.parseDouble(ans) / 100;
			weight = height * height * BMI;
			System.out.print("身長：" + ans + "cm");
			System.out.println("　体重：" + weight + "kg");
		}catch (IOException e) {
			System.err.println("値を読み込めませんでした");
		}catch (NumberFormatException e) {
			System.err.println("身長を数値で指定してください");
		}
	}
}
