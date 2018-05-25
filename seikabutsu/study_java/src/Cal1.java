package study_java;

import java.util.Calendar;
public class Cal1 {
	public static void main(String args[]) {
		Calendar now;
		int year, month, date;
		
		now = Calendar.getInstance();
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH) + 1;
		date = now.get(Calendar.DATE);
		System.out.println(year + "年" + month + "月" + date + "日");
	}

}
