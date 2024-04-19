package pkg03_casting;
import java.util.Scanner;
public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("문자 : "+str);
		char char1 =str.charAt(0);
		int numstr= (int)char1;
		System.out.println("유니코드 : "+numstr);
		sc.close();
	}

}
