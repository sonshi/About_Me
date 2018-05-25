package study_java;

import java.io.*;
public class FileWriter3 {
	public static void main(String args[]) {
		FileWriter fr;
		BufferedWriter bw;
		
		if (args.length != 1) {
			System.err.println("ファイル名を指定してください");
			System.exit(1);
		}
		try {
			fr = new FileWriter(args[0], true);
			bw = new BufferedWriter(fr);
			bw.write("追加したテキスト１");
			bw.newLine();
			bw.write("追加したテキスト２");
			bw.newLine();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			System.err.println("書き込めませんでした");
		}
	}
}
