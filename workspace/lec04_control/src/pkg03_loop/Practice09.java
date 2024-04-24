package pkg03_loop;
import java.util.Scanner;
public class Practice09 {
	public static void main(String[] args) {
		// 숫자를 키보드로 입력받기
		// 입력받은 값으로부터 시작해서 값이 10이 될 때까지
		// 하나씩 커지면서 출력
		// 최초에 입력된 숫자가 10보다 크더라도 반드시 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int a = sc.nextInt();
		do {
			System.out.println(a);
			a++;
		}while(a<=10);
		sc.close();
	}
}
