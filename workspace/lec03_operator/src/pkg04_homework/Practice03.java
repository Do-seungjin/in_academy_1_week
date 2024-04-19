package pkg04_homework;
import java.util.Scanner;
public class Practice03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int su1=sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int su2=sc.nextInt();
		System.out.print("세 번째 정수 : ");
		int su3=sc.nextInt();
		boolean result1= su1==su2;
		boolean result2= su2==su3;
		System.out.println("결과 : "+(result1&&result2));
		sc.close();
	}

}
