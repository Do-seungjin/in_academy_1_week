package pkg04_homework;
import java.util.Scanner;
public class Practice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구슬의 개수 : ");
		int ans = sc.nextInt();
		String str = ans%2==0 ? "짝수":"홀수";
		System.out.println("구슬의 개수는 "+str+"입니다.");
		sc.close();
	}

}
