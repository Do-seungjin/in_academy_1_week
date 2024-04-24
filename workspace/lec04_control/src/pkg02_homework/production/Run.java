package pkg02_homework.production;
import java.util.Scanner;
	//import pkg02_homework.production.Practice;
public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 놀이동산 입장료 계산하기");
		System.out.println("2. 일기예보");
		System.out.println("3. 세 개의 정수 비교하기");
		System.out.println("4. 철수네 공장");
		System.out.println("5. 헬스 마니아 철수");
		System.out.println("6. 합격인가? 불합격인가?");
		System.out.print("실행할 기능을 선택하세요.");
		int select = sc.nextInt();
		switch (select) {
		case 1:
			System.out.println("\"1. 놀이동산 입장료 계산하기\" 실행");
			new Practice().practice01();
		break;
		case 2:
			System.out.println("\"2. 일기예보\" 실행");
			new Practice().practice02();
		break;
		case 3:
			System.out.println("\"3. 세 개의 정수 비교하기\" 실행");
			new Practice().practice03();
		break;
		case 4:
			System.out.println("\"4. 철수네 공장\" 실행");
			new Practice().practice04();
		break;
		case 5:
			System.out.println("\"5. 헬스 마니아 철수\" 실행");
			new Practice().practice05();
		break;
		case 6:
			System.out.println("\"6. 합격인가? 불합격인가?\" 실행");
			new Practice().practice06();
		break;
		}
		
		sc.close();
	}
}
