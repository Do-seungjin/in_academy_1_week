package pkg03_compare;

public class MainClass {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		boolean bool1 = (num1 == num2);
		System.out.println("== 사용 : "+bool1);
		System.out.println(num1 == num2);
		boolean bool2 = num1 != num2;
		System.out.println("!= 사용 : "+bool2);
		boolean bool3 = num1 > num2;
		System.out.println("> 사용 : "+bool3);
		boolean bool4 = num1 <= num2;
		System.out.println("<= 사용 : " + bool4);
		
		int num3= 20 ;
		// 여러 비교 연산자를 연속적으로 수행하지 못한다
		// boolean bool5 = num1 < num2 < num3;
		
		// char 비교하기
		char c1 = 'a';
		char c2 = 'd';
		boolean bool5 = c1 < c2;
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println(bool5);
		
		// String(문자열) 비교하기
		String str1 = "출발";
		String str2 = "출발";
		boolean bool6 = str1 == str2;
		System.out.println("결과 : "+bool6);
		
		String noun1 = "나비";
		String noun2 = new String("나비");
		boolean bool7 = noun1.equals(noun2);
		System.out.println("나비 : "+bool7);
		
		boolean bool8 = noun1.equals("나비");
		System.out.println(bool8);
		
		// 논리 연산자 &&(and) 모두 true여야 true, ||(or) 둘 중에 하나라도 true면 true
		int su1 = 10 ; 
		int su2 = 5 ;
		int su3 = 7 ;
		boolean test1 = su1 > su2; // true
		boolean test2 = su1 > su3; // true
		boolean test3 = su1 < su2; // false
		
		boolean result1 = test1 && test2; // true && true
		// boolean result 1 (su1>su2)&&(su1>su3);
		
		boolean result2 = test1 && test3; // true && false
		
		System.out.println("true && true : "+result1);
		System.out.println("true && false : "+result2);
		
		boolean result3 = test1 || test2; // true || true
		boolean result4 = test1 || test3; // true || false
		System.out.println("true || true : "+result3);
		System.out.println("true || false : "+result4);
		
		//논리 부정 연산자 : !
		boolean isTrue = true;
		boolean isFalse = !isTrue;
		System.out.println("isFalse : "+isFalse);
		// true && false -> false -> true
		System.out.println(!(test1 && test3));
		// true && !false -> true
		System.out.println(test1 && !test3);
		
		//삼항 연산자
		// 조건식 ? true일때 식 : false일때 식 ;
		int x = 1 ;
		int y = 3 ;
		// x와 y를 비교했을때 x가 y보다 크면 x출력 y가 x보다 크면 y출력
		System.out.println(x > y ? x : y);
		int max = x>y? x:y;
		System.out.println("max : "+max);
		String max_str = x>y ? "x가 더 크다.":"y가 더 크다.";
		System.out.println(max_str);
		
		
	}

}
