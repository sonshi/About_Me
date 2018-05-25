package study_java;

import java.io.*;
public class FileRead2 {
	public static void main(String args[]) {
		FileReader fr;
		BufferedReader br;
		String str;
		
		if(args.length != 1) {
			System.err.println("ファイル名を指定してください");
			System.exit(1);
		}
		
		try {
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while(( str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch(FileNotFoundException e) {
			System.err.println("ファイルが見つかりません");
		} catch(IOException e) {
			System.err.println("読み込めませんでした");
		}
	}

}
