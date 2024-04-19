package pkg03_compare;
import java.util.Scanner;
public class Practice03 {

	public static void main(String[] args) {
		// 1. 키보드로 나이 (정수) 입력받기
		// 2. 50대인지 여부 출력
		// 출력 예시
		// 나이: 34
		// false
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		boolean result1 = age >= 50;
		boolean result2 = age < 60;
		System.out.println(result1 && result2);
	
	}

}
