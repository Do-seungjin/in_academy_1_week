package pkg03_method.study.controller;

import pkg03_method.study.model.vo.Declare;

public class Run {
	public static void main(String[] args) {
		// static 끼리만 호출가능
		// method1();
		// 인스턴스화
		Declare d = new Declare();
		//1. 리턴 없고, 매개변수 없을때
		d.method1();
		// new Declare().method1();
		// 2. 리턴 없고, 매개변수 있을때
		d.method2(4);
		// 3. 리턴 있고, 매개변수 없을때
		int num1 = d.method3();
		System.out.println(num1);
		// 4. 리턴 있고, 매개변수 있을때
		int num2=d.method4(2, 5);
		System.out.println(num2);
	}
	
	// 메소드 선언
	
	// 아무데나 static 선언 시 -> 불필요한 메모리 할당이 발생
//	public static void method1() {
//		System.out.println("method1이 실행!!!!!");
//	}
}