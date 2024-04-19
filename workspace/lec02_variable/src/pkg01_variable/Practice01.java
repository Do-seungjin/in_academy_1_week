package pkg01_variable;

public class Practice01 {

	public static void main(String[] args) {
		int x = 100 ;
		int y = 10 ;
		System.out.println("===첫번째 문제===");
		System.out.println(x+y);
		System.out.println("===두번째 문제===");
		System.out.println(y*(x+y));
		System.out.println("===세번째 문제===");
		System.out.println((y*(x+y))/y);
		// 예약어를 변수명으로 쓰고 싶을때는 but 안쓰는게 좋음
		int n_int;
		// 의미없는 변수명
		int a = 18;
		int b = a+7;
		System.out.println(a);
		System.out.println(b);
		// 의미있는 변수명 & 주석으로 코드 중간중간 많은 설명을 해주는 것이 중요하다
		/*
		 * 작성자 : 도승진 
		 * 작성일 : 2024-04-18 
		 * 목적 : 다음주 같은 요일 계산
		 */
		int today=18;
		int oneWeekAfterDay = today + 7;
	}

}
