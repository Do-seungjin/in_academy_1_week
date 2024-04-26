package pkg01_homework01.model.vo;

public class Calculate {
	public void method1(String a,String b) {
		System.out.println("메소드 1 실행합니다");
		System.out.println(a+" "+b);
	}
	public void method2(int a, int b) {
		System.out.println("메소드 2 실행합니다");
		if (a<b) {
			System.out.println("계산할 수 없습니다.");
			System.out.println("0");
		}else {
			System.out.println("두개의 정수의 곱 : "+(a*b));			
		}
	}
}
