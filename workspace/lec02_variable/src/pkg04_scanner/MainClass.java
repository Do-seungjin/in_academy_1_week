package pkg04_scanner;
// 1. import문 써준다
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		// System.in = 표준 입력 스트림
		// Scanner : 콘솔에서 입력한 값을 출력 하는 것
		
		// 2. 참조변수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt();
		System.out.println("입력된 정수는 "+number+" 입니다.");
		
		
		
		
//		byte b_num = sc.nextByte();
//		System.out.println(b_num);
//		
//		short s_num=sc.nextShort();
//		System.out.println(s_num);
		
		// 3. 메소드 사용
		
		// sc.nextByte();
		// sc.nextShort();
		// sc.nextInt(); int 타입 데이터 가져오기
		// sc.nextLong(); long 타입 데이터 가져오기
		// sc.nextFloat();    "
		// sc.nextDouble();   "
		// sc.nextBoolean();  "
		// sc.next(); String 타입 데이터 가져오기
		// sc.nextLine(); String 타입
		
		// !! char 데이터는 가져올 수 없다 !!
		
		// char 데이터 사용법
//		String str = sc.next();
//		System.out.println(str);
//		char char1 = sc.next().charAt(0);
//		System.out.println(char1);
		
		// next()와 nextLine()의 차이
		// sc.nextLine()은 \n 줄바꾸기를 읽어들인다.
		String str1 = sc.next();
		String str2 = sc.nextLine();
		System.out.println(str1);
		System.out.println(str2);
		
		
		// 4. 스트림을 닫아준다.
		sc.close();
	}

}
