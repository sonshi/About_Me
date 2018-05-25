package study_java;

public class IfElse2 {
	public static void main(String args[]) {
		int month;
		
		if (args.length != 1) {
			System.err.println("月を１つ指定してください");
			System.exit(1);
		} 
		try {
			month = Integer.parseInt(args[0]);
			if((month == 12) || (month == 1) || (month == 2)) {
				System.out.println("冬");
			} else if ((month == 3) || (month == 4) || (month ==5)) {
				System.out.println("春");
			} else if ((month == 6) || (month == 7) || (month == 8)) {
				System.out.println("夏");
			} else if ((month == 9) || (month == 10) || (month == 11)) {
				System.out.println("秋");
			} else {
				System.err.println("月は１〜１２までの整数です");
			}
		} catch (NumberFormatException e) {
			System.err.println("月を表す整数を指定してください");
		}
	}
}
