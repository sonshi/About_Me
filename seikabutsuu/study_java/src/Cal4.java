package study_java;

import java.util.Calendar;
public class Cal4 {
	public static void main(String args[]) {
		Calendar cal1, cal2;
		
		cal1 = Calendar.getInstance();
		cal2 = cal1;
		cal1.set(1980, 1, 1);
		System.out.println(cal2.get(Calendar.YEAR));
	}

}
