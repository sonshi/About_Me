package study_java;

import java.io.*;
public class KeyIn2 {
	public static void main(String args[]) {
		int in;
		try {
			in = System.in.read();
			System.out.println(in);
		}catch(IOException e) {
			System.out.println("読み込めませんでした");
		}
	}
}
