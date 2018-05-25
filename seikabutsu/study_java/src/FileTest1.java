package study_java;

import java.io.*;
public class FileTest1 {
	public static void main(String args[]) {
		File file;
		
		if (args.length != 1) {
			System.err.println("ファイル名を指定してください");
			System.exit(1);
		}
		
		file = new File(args[0]);
		
		System.out.print("exists() : ");
		System.out.println(file.exists());
		System.out.print("getName() : ");
		System.out.println(file.getName());
		System.out.print("getAbsolutePath() : ");
		System.out.println(file.getAbsolutePath());
		System.out.print("isDirectory() : ");
		System.out.println(file.isDirectory());
		System.out.print("length() : ");
		System.out.println(file.length());
		System.out.print("separator : ");
		System.out.println(file.separator);
	}
}
