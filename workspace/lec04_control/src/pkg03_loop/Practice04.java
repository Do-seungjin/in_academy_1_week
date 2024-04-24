package pkg03_loop;
import java.util.Scanner;
public class Practice04 {
	public static void main(String[] args) {
		// 외부로 한줄
		// 내부로 모양 만들기
		Scanner sc=new Scanner(System.in);
		System.out.print("가로의 개수 : ");
		int ga = sc.nextInt();
		System.out.print("세로의 개수 : ");
		int se = sc.nextInt();
		for(int i=1 ; i<=se ; i++) {
			System.out.print("\n");
			for(int j=1 ; j<=ga ; ++j) {
				System.out.print("*");
			}
		}
		sc.close();
	}
}
