package pkg03_compare;
import java.util.Scanner;
public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 두 개의 숫자를 입력받기
		System.out.print("첫 번째 숫자 : ");
		int su1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int su2 = sc.nextInt();
		// 2. 첫 번째 숫자와 두 번째 숫자 크기 비교
		boolean bool1 = su1 > su2;
		// 3. boolean 출력
		System.out.println("첫 번째 숫자가 두 번째 숫자보다 큰가요? "+bool1);
		sc.close();		
	}

}
