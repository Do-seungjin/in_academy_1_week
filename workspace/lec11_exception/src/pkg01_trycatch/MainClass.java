package pkg01_trycatch;

public class MainClass {
	
	public static void main(String[] args) {
		int a = 3 ;
		int b = 0 ;
		
		// 1. try 블록에서 예외가 발생하지 않을 경우
		// -> catch 블록 거치지 않고 빠져나감
		
		
		try {
			System.out.println(a+b);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		System.out.println("=== 예외발생 X 끝 ===");
		// 2. try문에서 오류 발생
		
		try {
			System.out.println("=== a/b 전 ===");
			System.out.println(a/b);
			System.out.println("=== a/b 후 ===");
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		System.out.println("=== 예외 발생 O 끝 ===");
		
		// 3. finally
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("어떤 상황이든 실행");
		}
		
		
		
		
		
	}
}
