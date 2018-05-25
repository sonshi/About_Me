package study_java;

import java.util.Calendar;
public class Cal3 {
	public static void main(String args[]) {
		Calendar now, xmas;
		int days;
		
		now = Calendar.getInstance();
		xmas = Calendar.getInstance();
		xmas.set(now.get(Calendar.YEAR), 11, 25);
		days = xmas.get(Calendar.DAY_OF_YEAR) - now.get(Calendar.DAY_OF_YEAR);
		
		System.out.println("クリスマスまであと" + days + "日");
	}

}
