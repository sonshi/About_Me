package study_java;

import java.io.*;
public class KeyIn3 {
	public static void main(String args[]) {
		int in;
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			while((in = isr.read()) != -1) {
				System.out.print((char)in);
		}
			isr.close();
		}catch(IOException e) {
			System.err.println("読み込めませんでした");
		}
	}
}
