package pkg04_homework;
import java.util.Scanner;
public class Practice04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("친구 수 : ");
		int friend = sc.nextInt();
		System.out.print("사탕의 개수 : ");
		int candy = sc.nextInt();
		int divide= candy / friend;
		int remain= candy % friend;
		System.out.println("1인당 사탕 개수 : "+divide);
		System.out.println("남는 사탕 개수 : "+remain);
		sc.close();
		
		
	}

}
