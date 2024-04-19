package pkg02_type;

public class MainClass {

	public static void main(String[] args) {
		// byte < short < int < long < float < double 순의 크기를 갖는다.
		// 정수형 변수
		byte b_num = 1;
		short s_num = 23;
		int i_num = 456;
		long l_num = 7890;
		// 실수형 변수
		float f_num=1.23f;
		double d_num=4.567;
		System.out.println(f_num);
		System.out.println(d_num);
		// 문자형 변수
		char grade='김';
		// char gender='Female';
		// 논리형 변수
		boolean isStudent = true ;
		System.out.println(isStudent);
		
		// String(문자열)
		String str1 = new String("감사");
		// 표준 출력 가능
		System.out.println(str1);
		// 재할당 가능
		str1 = new String("합니다.");
		System.out.println(str1);
		// 다른 변수의 값으로 사용 가능
		String str2 = str1 ;
		System.out.println(str2);
		// 기본형처럼 초기화 가능
		String str3 = "감사합니다";
		System.out.println(str3);
		System.out.println(1==1);
		
		// 기본형 비교 (같은 값을 넣으면 같다) 가지고 있는 값 자체를 비교
		int num1 = 2;
		int num2 = 2;
		System.out.println(num1==num2);
		
		// 참조형 비교 (같은 값을 넣어도 주소가 달라서 같지 않다) 
		// 실질적으로 뜻하는 의미가 다르다(주소값으로 처리 되기 때문에)
		String text1 = new String("apple");
		String text2 = new String("apple");
		System.out.println(text1 == text2);
		// +부호
		// 부호 사이에 문자열이 하나 이상
		System.out.println(1+2);
		System.out.println(1+" : "+2);
		// 문자열 변수 초기화에 + 부호 사용
		String str4 = new String("감사"+"합니다."+22);
		String str5 = "감사"+100+"합니다";
		System.out.println(str4);
		System.out.println(str5);
		// charAt()=문자열을 char 타입으로 변환 
		String name = "apple";
		// 자바에서 순서는 0부터 시작
		char singleCha = name.charAt(2);
		System.out.println(name+"의 3번째 문자는 "+singleCha+"입니다.");
		// 저장 가능 범위를 벗어난 값을 할당
		// 오버플로우 예시 byte b_number = 130 ;이 경우 에러 발생
		
	}

}