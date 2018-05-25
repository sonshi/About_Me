package study_java;

import java.io.*;
public class FileWrite4 {
	public static void main(String args[]) {
		FileWriter fr;
		PrintWriter pr;
		String ls;
		if (args.length != 1) {
			System.err.println("ファイル名を指定してください");
			System.exit(1);
		}
		
		try {
			fr = new FileWriter(args[0]);
			pr = new PrintWriter(new BufferedWriter(fr));
			pr.println("こんにちは");
			pr.println(100);
			pr.println('空');
			pr.println(3.54e3);
			pr.close();
		} catch(IOException e) {
			System.err.println("書き込めませんでした");
		}
	}
}
