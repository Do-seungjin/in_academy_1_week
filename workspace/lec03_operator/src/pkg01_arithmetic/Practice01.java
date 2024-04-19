package pkg01_arithmetic;
import java.util.Scanner;
public class Practice01 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int su1=sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int su2=sc.nextInt();
		
		int plus =su1+su2;
		int minus =su1-su2;
		int product =su1*su2;
		int divide =su1/su2;
		int remain =su1%su2;
		
		System.out.println("덧셈 : "+plus);
		System.out.println("뺄셈 : "+minus);
		System.out.println("곱셈 : "+product);
		System.out.println("나누기 : "+divide);
		System.out.println("나머지 : "+remain);
		
		sc.close();
	}
}
