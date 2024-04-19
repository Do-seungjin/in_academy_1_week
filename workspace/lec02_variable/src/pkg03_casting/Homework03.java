package pkg03_casting;
import java.util.Scanner;
public class Homework03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		System.out.println("한자리 숫자를 입력하세요 : "+str);
		char char1 = str.charAt(0);
		int str2 = (int)char1-48 ;
		System.out.println("입력한 숫자의 제곱은 "+(str2*str2)+"입니다.");
		sc.close();

	}

}
