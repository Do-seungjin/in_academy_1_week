package pkg03_casting;

public class Practice01 {

	public static void main(String[] args) {
		int num1 = 10 ;
		double num2 = 5.7 ;
		// 바로 표준 출력
		System.out.println("정수 : "+(num1+(int)num2));
		
		System.out.println("실수 : "+(num1+num2));
		
		
		// 변수 선언
		int num3= num1 + (int)num2;
		double num4 = num1 + num2;
		System.out.println("정수 : "+num3);
		
		System.out.println("실수 : "+num4);
	}

}
