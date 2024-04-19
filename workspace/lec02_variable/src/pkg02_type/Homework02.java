package pkg02_type;
import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double garo=sc.nextDouble();
		System.out.println("가로 : "+garo);
		double sero=sc.nextDouble();
		System.out.println("세로 : "+sero);
		System.out.println("면적 : "+(garo*sero));
		System.out.println("둘레 : "+((garo+sero)*2));
		
		sc.close();
	}

}
