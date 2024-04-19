package pkg04_homework;
import java.util.Scanner;
public class Practice05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어 : ");
		int korean=sc.nextInt();
		System.out.print("수학 : ");
		int math=sc.nextInt();
		System.out.print("영어 : ");
		int english=sc.nextInt();
		System.out.print("과학 : ");
		int science=sc.nextInt();
		int total= korean+math+english+science;
		double avg= total / 4.0;
		System.out.println("합계 : "+total);
		System.out.println("평균 : "+avg);
		String str= avg>90? "휴대폰을 바꿉니다": "휴대폰을 바꿀 수 없습니다.";
		System.out.println(str);
		sc.close();
	}

}
