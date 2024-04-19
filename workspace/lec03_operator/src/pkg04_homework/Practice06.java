package pkg04_homework;
import java.util.Scanner;
public class Practice06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-)포함 : ");
		String id= sc.next();
		char char1 = id.charAt(7);
		int a=(int)char1-48;
		String str= a%2==0? "여성":"남성";
		System.out.println("입력하신 주민번호는 "+str+"입니다.");
		sc.close();

	}

}
