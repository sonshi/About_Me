package study_java;

import java.util.Arrays;

public class Keyword2 {
	public static void main(String args[]) {
		String secret = "boo";
		int index;
		if(!((args.length >= 1) && (args.length <= 3))) {
			System.err.println("単語を３つまで指定");
			System.exit(1);
		} 
		
		Arrays.sort(args);
		index = Arrays.binarySearch(args, secret);
		if(index >= 0) {
			System.out.println("秘密の言葉は" + args[index]);
		} else {
			System.out.println("秘密の言葉は見つかりませんでした");
		}
	}
}
