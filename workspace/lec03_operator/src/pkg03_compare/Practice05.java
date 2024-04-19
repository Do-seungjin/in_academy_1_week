package pkg03_compare;
import java.util.Scanner;
public class Practice05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int su1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int su2 = sc.nextInt();
		int min= su1<su2?su1:su2;
		System.out.println("두 수 중에서 작은 수는 "+min+"입니다.");
		sc.close();
		
	}

}
 