package pkg02_type;
import java.util.Scanner;
public class Homework03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str1 =sc.next();
		String str2 =sc.nextLine();
		System.out.print("문자열을 입력하세요 : ");
		System.out.println(str1);
		char char1 = str1.charAt(0);
		char char2 = str1.charAt(1);
		char char3 = str1.charAt(2);
		System.out.println("첫 번째 문자 : "+char1);
		System.out.println("두 번째 문자 : "+char2);
		System.out.println("세 번째 문자 : "+char3);
		sc.close();
	}

}
