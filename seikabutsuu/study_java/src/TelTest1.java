package study_java;

public class TelTest1 {
	public static void main(String args[]) {
		Tel1 t1, t2;
		t1 = new Tel1("0x-1234-xx1", "田中一郎");
		t2 = new Tel1("0x-3243-xx1", "芹川花子");
		
		System.out.println(t1.name + " " + t1.tel);
		System.out.println(t2.name + " " + t2.tel);
	}
}
