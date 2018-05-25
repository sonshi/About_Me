package study_java;

import java.io.*;
public class FileRead3 {
	public static void main(String args[]) {
		FileReader fr;
		LineNumberReader lr;
		String str;
		
		if(args.length != 1) {
			System.err.println("ファイルを指定してください");
			System.exit(1);
		}
		
		try {
			fr = new FileReader(args[0]);
			lr = new LineNumberReader(fr);
			while(( str = lr.readLine()) != null) {
				System.out.print(lr.getLineNumber() + ": ");
				System.out.println(str);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			System.err.println("ファイルが見つかりません");
		} catch (IOException e) {
			System.err.println("読み込めませんでした");
		}
	}
}
