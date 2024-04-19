package pkg04_homework;
import java.util.Scanner;
public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("말해보세요 : ");
		String ans = sc.next();
		boolean bool1= ans.equals("간다");
		String str =  bool1 == true?"온다":"간다";
		System.out.println("앵무새 : "+str);
		sc.close();

	}

}
