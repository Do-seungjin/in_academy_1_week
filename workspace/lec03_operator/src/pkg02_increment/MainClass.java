package pkg02_increment;

public class MainClass {

	public static void main(String[] args) {
		
		int num = 5 ;
		// 전위 증가 연산자 (즉시 결과 반영)
		System.out.println("== 전위 연산 ==");
		System.out.println("1 : " + num);
		System.out.println("2 : " + ++num);
		System.out.println("3 : " + num);
		
		int su = 3 ;
		// 후위 증가 연산자 ( 다음번에 결과 반영)
		System.out.println("== 후위 연산 ==");
		System.out.println("1 : " + su);
		System.out.println("2 : " + su++);
		System.out.println("3 : " + su);
		
		// 두개의 변수 전위, 후위 연산
		int a = 2, b = 0 ;
		System.out.println("최초 a : " + a);
		System.out.println("최초 b : " + b);
		// 전위 증가 연산
		b = ++a;
		// 1. a = a + 1 ; -> a = 3 ;
		// 2. b = a ; -> b = 3 ;
		System.out.println("연산 후 a : " + a);
		System.out.println("연산 후 b : " + b);
		
		
		int x = 2, y = 0;
		System.out.println("최초 x : " + x);
		System.out.println("최초 y : " + y);
		// 후위 증가 연산
		y = x++;
		// 1. y = x; -> y = 2;
		// 2. x = x + 1; -> x = 3;
		System.out.println("연산 후 x : " + x);
		System.out.println("연산 후 y : " + y);
		
		
		// 전위 감소 연산
		int c=5, d=3;
		d = --c;
		// 1. c = c-1; -> c = 4
		// 2. d = c; -> d = 4
		System.out.println("연산 후 c : " + c);
		System.out.println("연산 후 d : " + d);
		
		
		// 후위 감소 연산
		int e=5, f=3;
		f= e--;
		// 1. f = e -> f = 5
		// 2. e = e - 1 -> e = 4
		System.out.println("연산 후 e : " + e);
		System.out.println("연산 후 f : " + f);
		
	}

}
