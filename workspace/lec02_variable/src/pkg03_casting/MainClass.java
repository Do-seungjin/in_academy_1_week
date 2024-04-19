package pkg03_casting;

public class MainClass {

	public static void main(String[] args) {
		// 업캐스팅 = 자동형변환
		// 값의 범위가 작은 데이터가 값의 범위가 큰 변수에 할당될 경우
		int a= 23 ;
		double b = a ;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		
		// 값의 범위가 다른 2개의 값이 산술 연산
		int c = 3 ;
		double d = 20.5 ;
		// 3이 3.0으로 형변환 후 3.0과 20.5가 연산
		System.out.println(c+d);
		
		// char 타입 변수
		char f = '2';
		System.out.println(50+f);
		// 50 + '2' = 100 
		// -> ASCII 상으로 2가 곧 50이라는 뜻을 가진다.
		
		// char 타입 업캐스팅 활용
		// '2' ASCII 값으로 형변환하면 50
		// '2' - 48 = 2 이때 48은 '0'
		// 그래서 '2' - '0' = 2 이 도출된다.
		System.out.println(f-'0');
		// 사용자가 입력한 문자 '5'를 숫자 5로 가장 빠르게 변환하는 방법은?
		System.out.println('5'-'0');
		
		// 다운캐스팅
		double d_num = 3.14 ; 
		int i_num = 4 ;
		System.out.println(d_num+i_num);
		// 정수로 보고 싶을때
		// 3.14 -> 3 정수타입으로 변환 (다운캐스팅)
		System.out.println((int)d_num);
		System.out.println((int)d_num+i_num);
		
		// char의 다운캐스팅
		char apple = 'A';
		int numApple = (int)apple;
		System.out.println(apple);
		System.out.println(numApple);
		System.out.println((int)'a');
		// ASCII값으로 소문자 a = 97 대문자 A = 65 두개의 차이는 32
		
		// 소문자를 대문자로 변환 -> 32를 빼준다.
		char char1 = 'a';
		// ASCII(정수형 숫자)를 char로 변환
		char char2= (char)(char1-32);
		System.out.println(char1-32);
		System.out.println(char2);
		// 대문자를 소문자로 변환 -> 32를 더해준다.
		
		
	}

}
