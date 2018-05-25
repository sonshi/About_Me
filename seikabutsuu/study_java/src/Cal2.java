package study_java;

import java.util.Calendar;
public class Cal2 {
	public static void main(String args[]) {
		Calendar now;
		int dayOfYear, maxDayOfYear;
		
		now = Calendar.getInstance();
		dayOfYear = now.get(Calendar.DAY_OF_YEAR);
		maxDayOfYear = now.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("今年の残り日数" + (maxDayOfYear - dayOfYear) + "日");
	}
}
