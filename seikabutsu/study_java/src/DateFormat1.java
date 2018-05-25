package study_java;

import java.util.*;
import java.text.DateFormat;

public class DateFormat1 {
	public static void main(String args[]) {
		DateFormat dateFormat;
		Date now = new Date();
		String date;
		
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		date = dateFormat.format(now);
		System.out.println(date);
	}
}
