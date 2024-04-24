package pkg01_condition;
import java.util.Scanner;
public class Practice05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("밝기 : ");
		int su=sc.nextInt();
		switch (su) {
		case 0:
			System.out.println("조명을 끕니다.");
		break;
		case 1:
			System.out.println("어두운 조명입니다.");
		break;
		case 2:
			System.out.println("밝은 조명입니다.");
		break;
		case 3:
			System.out.println("매우 밝은 조명입니다.");
		break;
		default:
			System.out.println("올바른 입력이 아닙니다.");
		break;
		}
		
		sc.close();
	}

}
