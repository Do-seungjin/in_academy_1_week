package pkg03_loop;
import java.util.Scanner;
public class Practice07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 : ");
		int a= sc.nextInt();
		for(int j=1 ; j<=a ; j++) {
			System.out.print("\n");
			for(int i=j;i<=0;i--) {
				System.out.print("*");
			}
		}
		sc.close();
	}
}
