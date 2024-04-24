package pkg03_loop;

public class Practice02 {
	public static void main(String[] args) {
		
		int sum=0;
		for (int i=1 ;   ; i++) {
			System.out.println("i : "+i);
			sum += i;
			if (sum>100) {
				System.out.println("i들의 합 : "+sum);
				break;
			}
		}
	}
}
