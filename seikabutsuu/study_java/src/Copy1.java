package study_java;

import java.io.*;
public class Copy1 {
	public static void main(String args[]) {
		FileInputStream fis;
		FileOutputStream fos;
		int b;
		
		if (args.length != 2) {
			System.err.println("使い方：java Copy1 file1 file2");
			System.exit(1);
		}
		
		try {
			fis = new FileInputStream(args[0]);
			fos = new FileOutputStream(args[1]);
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
			fis.close();
			fos.flush();
			fos.close();
		} catch(FileNotFoundException e) {
			System.err.println("ファイルが見つかりません");
		} catch(IOException e) {
			System.err.println("コピーできませんでした");
		}
	}
}
