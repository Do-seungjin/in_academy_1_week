package pkg01_variable;

public class MainClass {

	public static void main(String[] args) {
		
		// 상수 : 프로그램 내에서 변하지 않는 값 변하면 안되는 값 (예:원주율)
		// 한번 선언하면 값이 변하지 않는다 
		// final을 붙여서 선언한다
  		final double PI = 3.14;
		// PI =2.14; (X)
		System.out.println(PI*10*2);
		final int MAX_SIZE = 100;

		
		// 변수의 선언
		// 종류 변수명;
		// 정수 : 소수점이 없는 숫자
		// 정수형 변수 number 선언하기
		int number;
		//변수의 초기화
		//변수명 = 리터럴;
		number = 7 ;
		// 따로 선언 후 초기화
		// 선언과 동시에 초기화
		int age = 100 ;
		// 변수 표준출력 밑에 두개는 다른 것을 출력한다
		System.out.println(age);
		System.out.println("age");
		// age 변수에 새로운 값 90 재할당
		age = 90 ;
		System.out.println(age);
		// 변수로 할당
		int num = age ;
		System.out.println(num);
		// 변수 사용하지 않았을때
		System.out.println(2*3.141592653589793*10);
		System.out.println(3.141592653589793*10*10);
		System.out.println(3.141592653589793*10*10*20);
		// 변수 사용했을때
		// 가독성이 좋아진다, 재사용성이 증가한다, 코드량이 감소한다, 유지보수가 용이하다
		// 실수 : 소수점이 있는 숫자
		double pi = 3.141592653589793;
		int r = 10;
		System.out.println(2*pi*r);
		System.out.println(pi*r*r);
		System.out.println(pi*r*r*20);
	}

}
