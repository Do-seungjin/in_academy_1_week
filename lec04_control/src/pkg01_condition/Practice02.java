package pkg01_condition;
public class Practice02 {

	public static void main(String[] args) {
		int su1 ;
		su1 = 5;
		int remain = su1 % 2;
		boolean isMatch =remain ==0;
		
		if (isMatch) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		int i_num = 500;
		if (i_num >= 400) {
			// 400보다 크거나 같은 수 
			System.out.println("1. 400 ~");
		} else if (i_num >=300){
			// 400보다 작은 수 중에서 300보다 크거나 같은 수
			// if 조건식 결과가 false인 경우 중에서 
			// 300보다 크거나 같은 수
			System.out.println("2. 300~399");
		} else if(i_num>=200) {
			// 400보다 작은 수 중에서 300보다 작은 수 중에서
			// 200보다 크거나 같다.
			System.out.println("3. 200~299");
		} else {
			// 모두 다 false인 나머지 수
			System.out.println("4. ~ 199");
		}

	}

}
