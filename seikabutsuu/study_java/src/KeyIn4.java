package study_java;

import java.io.*;
public class KeyIn4 {
	public static void main(String args[]) {
		String str;
		InputStreamReader isr;
		BufferedReader br;
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		try {
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		}catch(IOException e) {
			System.err.println("読み込めませんでした");
		}
	}
}
