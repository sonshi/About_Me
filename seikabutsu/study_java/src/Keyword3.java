package study_java;

public class Keyword3 {
	public static void main(String args[]) {
		String secret = "boo";
		int i = 0;
		if(!((args.length >= 1) && (args.length <= 3))) {
			System.err.println("単語は３つまで");
			System.exit(1);
		}
		
		while (i < args.length) {
			if (args[i].equals(secret)) {
				System.out.println("秘密の言葉は" + args[i]);
				break;
			}
			i++;
		}
		if ( i == args.length) {
			System.out.println("秘密の言葉が違います");
		}
	}
}
