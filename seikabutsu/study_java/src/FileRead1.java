package study_java;

import java.io.*;
public class FileRead1 {
	public static void main(String args[]) {
		FileReader fr;
		int i;
		
		if (args.length != 1) {
			System.err.println("ファイル名を指定してください");
			System.exit(1);
		}
		
		try {
			fr = new FileReader(args[0]);
			while((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			fr.close();
		} catch(FileNotFoundException e) {
			System.err.println("ファイルが見つかりませんでした");
		} catch(IOException e) {
			System.err.println("読み込めませんでした");
		}
	}
}
