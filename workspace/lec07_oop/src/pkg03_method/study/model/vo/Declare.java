package pkg03_method.study.model.vo;

public class Declare {
	public void run() {
		// 동일 클래스 내부 메소드 호출
		// 1. 리턴 없고, 매개변수 없을때
		method1();
		// 2. 리턴 없고, 매개변수 있을때
		method2(3);
		// 3. 리턴 있고, 매개변수 없을때
		int num1 = method3();
		// 4. 리턴 있고, 매개변수 있을때
		int num2 = method4(5,7);
	}
	
	
	// 메소드의 표현식
	// [접근제한자] [예약어] 반환형 메소드명([매개변수]){}
	
	// 1. 메소드명 숫자로 시작 금지
	// 2. 예약어를 변수 이름으로 사용 금지
	// 3. 특수문자 언더바와 달러 외 사용 금지
	// 4. 메소드명에 공백 사용 불가능
	
	// 메소드명 권고사항
	// 1. 수행하는 기능이나 의도를 잘 나타낼 수 있는 의미 있는 이름
	// 2. 여러 단어로 이루어진 경우 카멜 케이스로 작성
	// 3. 가능하면 약어보다 전체 단어 사용
	// 4. 유사한 기능을 수행하는 메소드 들 간의 일관성 유지하여 명명
	// 5. 불필요한 정보는 제거하여 코드를 간결하게 유지
	
	
	// 1. 리턴 없고 ->void, 매개변수 없을때-> ()사이가 빈칸
	public void method1() {
		System.out.println("메소드 1이 실행됩니다.");
	}
	
	// 2. 리턴 없고, 매개변수 있을때
	public void method2 (int x) {
		System.out.println(x+"를 이용하는 함수 메소드 2");
	}
	
	// 3. 리턴 있고 void->반환하고자하는 데이터의 형태입력, 매개변수 없을때
	public int method3() {
		System.out.println("method3이 실행됩니다.");
		return 10;
	}
	
	// 4. 리턴 있고, 매개변수 있을때
	public int method4(int a, int b) {
		System.out.println("method4 가 실행됩니다.");
		return a+b;
	}
	
	
}
