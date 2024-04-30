package pkg03_override.practice;

public class Run {
	public static void main(String[] args) {
		Food f = new Food();
		f.printInfo();
		Pizza p = new Pizza();
		p.printInfo();
		
		String str = new String("나비");
		
		if(str.equals("나비")) {
			System.out.println("나비입니다.");
		}
		
	}
}
