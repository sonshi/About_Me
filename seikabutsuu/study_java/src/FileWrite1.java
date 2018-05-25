package study_java;

import java.io.*;
public class FileWrite1 {
	public static void main(String args[]) {
		FileWriter fr;
		String ls;
		if (args.length != 1) {
			System.err.println("ファイル名を指定してください");
			System.exit(1);
		}
		
		try {
			fr = new FileWriter(args[0]);
			ls = System.getProperty("line.separator");
			fr.write("こんにちは" + ls);
			fr.write("さようなら" + ls);
			fr.flush();
			fr.close();
		} catch(IOException e) {
			System.err.println("書き込めませんでした");
		}
	}
}
