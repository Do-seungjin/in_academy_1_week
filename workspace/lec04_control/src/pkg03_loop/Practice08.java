package pkg03_loop;

public class Practice08 {
	public static void main(String[] args) {
		int a=1;
		while(true) {
			System.out.println("반복 횟수 : "+a);
			a++ ;
			if(a > 5) {
				System.out.println("반복 종료!");
				break;
			}
		}
	}
}
