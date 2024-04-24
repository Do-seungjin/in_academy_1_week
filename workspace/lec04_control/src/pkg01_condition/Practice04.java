package pkg01_condition;
import java.util.Scanner;
public class Practice04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("성별(F/M) : ");
		String str=sc.next();
		System.out.print("머리(cm) : ");
		int su1 =sc.nextInt();
		System.out.print("남성 머리 기준(cm) : ");
		int su2 =sc.nextInt();
		System.out.print("여성 머리 기준(cm) : ");
		int su3 =sc.nextInt();
		boolean isPass = false;
		if(str.equals("F")) {
			if (su1<=su3) {
				isPass = true;
			}
//				System.out.println("합격입니다.");
//			}
//			else {
//				System.out.println("불합격입니다.");
//			}
		} else if(str.equals("M")){
			if (su1<=su2) {
				isPass=true;
			}
//				System.out.println("합격입니다.");
//			}else {
//				System.out.println("불합격입니다.");
//			}
		}else {
			System.out.println("알 수 없는 성별입니다.");
		}
		if(isPass==true) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		sc.close();
	}

}
