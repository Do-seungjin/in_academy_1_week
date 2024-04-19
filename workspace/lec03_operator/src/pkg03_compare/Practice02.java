package pkg03_compare;
import java.util.Scanner;
public class Practice02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		boolean bool1 = name.equals("Chulsu");
		System.out.println("일치하나요?"+bool1);
		String str = bool1 == false? "잘못된 닉네임":"일치";
		System.out.println(str);
		sc.close();
	}

}
