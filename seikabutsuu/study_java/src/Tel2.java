package study_java;

public class Tel2 {
	String tel, name;
	
	Tel2(String tel, String name){
		this.tel = tel;
		this.name = name;
	}
	
	public static void main(String args[]) {
		Tel2 t1, t2;
		t1 = new Tel2("0x-1234-xx1", "田中一郎");
		t2 = new Tel2("0x-3243-xx1", "芹川花子");
		
		System.out.println(t1.name + " " + t1.tel);
		System.out.println(t2.name + " " + t2.tel);
	}
}
