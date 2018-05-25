package study_java;

import java.io.*;
public class FileWrite5 {
	public static void main(String args[]) {
		FileWriter fr;
		BufferedWriter bw;
		String ls, str;
		InputStreamReader isr;
		BufferedReader br;
		File file;
		
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		
		if(args.length != 1) {
			System.err.println("ファイル名を指定してください");
			System.exit(1);
		}
		try {
			file = new File(args[0]);
			if(file.exists()) {
				System.out.println("上書きしてもいいですか？");
				System.out.println("よければ「y」を入力してください");
				if(!br.readLine().equals("y")) {
					System.exit(1);
				}
			}
			fr = new FileWriter(args[0]);
			bw = new BufferedWriter(fr);
			
			while(( str = br.readLine()) != null) {
				bw.write(str);
				bw.newLine();
			}
			bw.flush();
			bw.close();
			br.close();
		} catch(IOException e) {
			System.err.println("書き込めませんでした");
		}
	}
}
