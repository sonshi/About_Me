package study_java;

import java.io.*;
import java.util.*;
public class Vector1 {
	public static void main(String args[]) {
		FileReader fr;
		BufferedReader br;
		String str;
		Vector vec = new Vector(4);
		
		if (args.length != 1) {
			System.err.println("ファイルを指定してください");
			System.exit(1);
		}
		
		try {
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			//各行をVectorに読み込む
			while(( str = br.readLine()) != null) {
				vec.add(str);
			}
			fr.close();
			//Vectorの各要素を順に表示する
			for (int i = 0; i < vec.size(); i++) {
				System.out.println((String)vec.get(i));
			}
			
		
		} catch(FileNotFoundException e) {
			System.err.println("ファイルが見つかりませんでした");
		} catch(IOException e) {
			System.err.println("読み込めませんでした");
		}
	}
}
