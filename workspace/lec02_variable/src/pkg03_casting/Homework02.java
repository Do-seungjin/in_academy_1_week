package pkg03_casting;
import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double korean=sc.nextDouble();
		double english=sc.nextDouble();
		double math=sc.nextDouble();
		System.out.println("국어 : "+korean);
		System.out.println("영어 : "+english);
		System.out.println("수학 : "+math);
		int total=(int)korean+(int)english+(int)math;
		int average = ((int)korean+(int)english+(int)math)/3;
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+average);
		sc.close();
	}

}
