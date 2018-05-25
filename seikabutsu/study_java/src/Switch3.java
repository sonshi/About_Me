package study_java;

public class Switch3 {
	public static void main(String args[]) {
		int age;
		
		try {
			age = Integer.parseInt(args[0]);
			switch (age) {
			case 0:
				System.out.println("誕生");
				break;
			case 3:
			case 5:
			case 7:
				System.out.println("七五三");
				break;
			case 20:
				System.out.println("成人式");
				break;
			case 61:
				System.out.println("還暦");
				break;
			case 70:
				System.out.println("古希");
				break;
			case 77:
				System.out.println("喜寿");
				break;
			case 80:
				System.out.println("傘寿");
				break;
			case 88:
				System.out.println("米寿");
				break;
			case 90:
				System.out.println("卒寿");
				break;
			case 99:
				System.out.println("白寿");
				break;
			case 100:
				System.out.println("百寿");
				break;
			default:
				System.out.println("特にありません");
			}
			
		} catch (Exception e) {
			System.err.println("年齢を指定してください");
		}
	}
}
