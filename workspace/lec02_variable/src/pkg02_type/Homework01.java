package pkg02_type;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double weight=sc.nextDouble();
		System.out.println("몸무게(kg) : "+weight);
		double height=sc.nextDouble();
		System.out.println("키(m) : "+height);
		System.out.println("BMI 지수 : "+(weight/(height*height)));
		
		sc.close();

//		// System.out.printf("표현식", 출력값);
//		System.out.printf("%d",3);
//		System.out.printf("%c",'A');
//		// %5d : 왼쪽 5칸을 확보, 오른쪽 정렬
//		System.out.printf("%5d", 1);
//		// %-5d : 오른쪽 5칸을 확보, 왼쪽 정렬
//		System.out.printf("%-5d",2);
//		// %.2f : 소수점 아래 2자리까지만 표시
//		System.out.printf("%.2f",3.141592653589793);
	}

}
