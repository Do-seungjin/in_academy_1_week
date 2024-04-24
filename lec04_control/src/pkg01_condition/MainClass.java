package pkg01_condition;

public class MainClass {

	public static void main(String[] args) {
		int number = 10;
		if (number > 5){ 
			System.out.println("number는 5보다 큽니다");
		}
		// 지역 변수
		// java에서 변수 : 블록 스코프 : 블록이 어디 범주까지 적용되는지 확인 후 사용
		int su = 5;
		if(su>3) {
			int num =2;
			System.out.println("블록 안 : "+num);
			System.out.println("블록 안 : "+su);
		}
		//	System.out.println("블록 밖 : "+num);
		// num은 if 문 안에서만 활동이 가능하다.
		System.out.println("블록 밖 : "+su);
		
		int num = -3;
		System.out.println(num);
		if (num > 0) {
			System.out.println("양수입니다.");
		} else {
			//else : if와 반대되는 모든 부분 
			// 음수이거나 0인 경우
			System.out.println("음수입니다.");
		}
		
		// 중첩 if문
		int target = -5;
		if (target > 0) {
			System.out.println("양수입니다.");
			// 양수 중에 짝수 홀수(중첩)
			if (target % 2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
				// 홀수 중에 3의 배수 (중첩)
				if(target % 3 == 0) {
					System.out.println("3의 배수");
				}
			}
			
		} else if (target<0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0 입니다.");
		}
		
		// 1~7 사이의 숫자를 통해 해당 요일 출력
		int day = 3;
		switch(day) {
	
//			case 1 :
//				System.out.println("월요일");
//			break;
//			case 2 :
//				System.out.println("화요일");
//			break;
//			case 3 :
//				System.out.println("수요일");
//			break;
//			case 4 :
//				System.out.println("목요일");
//			break;
//			case 5 :
//				System.out.println("금요일");
//			break;
//			case 6 :
//				System.out.println("토요일");
//			break;
//			case 7 :
//				System.out.println("일요일");
//			break;
			// default에는 break를 꼭 써야되는 것은 아니다.
			default :
				System.out.println("잘못된 입력입니다.");
		}
		
		
		
		
		
		
	}

}
