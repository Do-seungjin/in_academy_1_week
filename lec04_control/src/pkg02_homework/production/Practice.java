package pkg02_homework.production;
import java.util.Scanner;
public class Practice {
	public void practice01() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("나이 : ");
		int age=sc1.nextInt();
		int price;
		if (age>=65) {
			System.out.println("당신의 놀이동산 요금은 무료입니다.");
		}else if(age>=19) {
			price=30000;
			System.out.println("당신의 놀이동산 요금은 "+price+"입니다.");
		}else if(age>=13) {
			price=20000;
			System.out.println("당신의 놀이동산 요금은 "+price+"입니다.");
		}else if(age>=3)  {
			price=10000;
			System.out.println("당신의 놀이동산 요금은 "+price+"입니다.");
		}else {
			System.out.println("당신의 놀이동산 요금은 무료입니다.");
		}
		sc1.close();
	}
	
	public void practice02() {
		Scanner sc2=new Scanner(System.in);
		System.out.print("월 : ");
		int month = sc2.nextInt();
		System.out.print("기온 : ");
		int degree = sc2.nextInt();
		if(month<=2) {
			System.out.print("겨울");
			if(degree<=-15) {
				System.out.println(" 한파 경보");
			}
		}else if(month<=5) {
			System.out.print("봄");
			}else if(month<=8) {
			System.out.print("여름");
			if(degree>=35) {
				System.out.println(" 폭염 경보");
		}
			}else if(month<=11) {
			System.out.print("가을");
			}else if(month<=12) {
			System.out.print("겨울");
			if(degree<=-15) {
				System.out.print(" 한파 경보");
			}
		}else {
			System.out.print("해당하는 계절이 없습니다.");}
		sc2.close();
	}
	
	public void practice03() {
		Scanner sc3 = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1=sc3.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2=sc3.nextInt();
		System.out.print("세 번째 정수 : ");
		int num3=sc3.nextInt();
		int min1= num1<num2 ? num1 : num2 ;
		int min2= min1<num3 ? min1 : num3 ;
		System.out.println("세 수 중에서 가장 작은 수는 "+min2+"입니다.");
		sc3.close();
	}

	public void practice04() {
		Scanner sc4=new Scanner(System.in);
		System.out.print("수집된 코드 : ");
		int error = sc4.nextInt();
		switch(error) {
		case 400:
			System.out.println("잘못된 요청입니다.");
		break;
		case 404:
			System.out.println("요청하신 서비스를 찾을 수 없습니다.");
		break;
		case 500:
			System.out.println("처리 방법을 알 수 없는 문제가 발생했습니다.");
		break;
		case 503:
			System.out.println("일시적인 서버 오류가 발생하였습니다.");
		break;
		default:
			System.out.println("알 수 없는 오류가 발생하였습니다.");
		}
		sc4.close();
	}

	public void practice05() {
		Scanner sc5=new Scanner(System.in);
		System.out.print("번호를 입력하세요.");
		int number = sc5.nextInt();
		if(number==1) {
			System.out.println("스쿼드 운동 시간입니다.");
		}else if(number==2) {
			System.out.println("데드리프트 운동 시간입니다.");
		}else if(number==3) {
			System.out.println("벤치 프레스 운동 시간입니다.");
		}else if(number==4) {
			System.out.println("풀업 운동 시간입니다.");
		}else if(number==5) {
			System.out.println("오늘도 수고하셨습니다.");
		}else if(number<=0) {
			System.out.println("양수만 입력해주세요");
		}else {
			System.out.println("목록에 있는 숫자만 입력해주세요.");
		}
		sc5.close();
	}

	public void practice06() {
		System.out.println("각 과목의 점수를 입력하세요.");
		Scanner sc6=new Scanner(System.in);
		System.out.print("1. 소프트웨어설계 점수 : ");
		int sub1=sc6.nextInt();
		System.out.print("2. 소프트웨어개발 점수 : ");
		int sub2=sc6.nextInt();
		System.out.print("3. 데이터베이스구축 점수 : ");
		int sub3=sc6.nextInt();
		System.out.print("4. 프로그래밍언어활용 점수 : ");
		int sub4=sc6.nextInt();
		System.out.print("5. 정보시스템구축관리 점수 : ");
		int sub5=sc6.nextInt();
		double avg=(sub1+sub2+sub3+sub4+sub5)/5.0;
		if (avg>=60) {
			if(sub1<40) {
				System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
			}else if(sub2<40) {
				System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
			}else if(sub3<40) {
				System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
			}else if(sub4<40) {
				System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
			}else if(sub5<40) {
				System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
			}else {
				System.out.println("합격을 축하합니다.");
			}
		}else {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
		}
		sc6.close();
	}
}
