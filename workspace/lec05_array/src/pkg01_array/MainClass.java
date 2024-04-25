package pkg01_array;

public class MainClass {
	public static void main(String[] args) {
		// 배열을 사용하지 않는다면
		int score1 = 90;
		int score2 = 40;
		int score3 = 70;
		int score4 = 20;
		int score5 = 100;
		
		// 배열을 사용한다면
		// 자료형[] 배열명
		// 자료형 배열명[]
		int[] scores= {90,40,70,20,100};
		
		// 배열 선언
		int[] intArr; 
		String[] names;
		// 배열 생성
		// 배열명 = new 자료형 [크기]
		intArr = new int[4];
		
		// 배열 선언, 생성 동시
		int[] heights = new int[10];
		
		// 배열의 저장 구조
		int[] arr;
		arr=new int[4];
		System.out.println(arr);
		System.out.println(arr[0]);
		
		// 배열의 길이 -> 상수 (한번 값을 할당해주면 절대 바꿀 수 없음)
		int[] numArr = new int[3];
		System.out.println(numArr[1]);
		System.out.println(numArr.length);
		
		// 문자열의 길이
		String str = new String("안녕하세요");
		System.out.println(str.length());
		
		// 배열의 초기화
		// 1. 인덱스를 이용 : 보통 규칙이 없는 경우
		int[] age1 = new int[3];
		System.out.println("초기화 전 : "+age1[1]);
		age1[0] = 30;
		age1[1] = 20;
		age1[2] = 70;
		System.out.println("초기화 후 : "+age1[1]);
		age1[1] = 50;
		System.out.println("재할당 : "+age1[1]);
		// String 같이 숫자로 표현할 수 있는 규칙이 없을 때 인덱스 사용
		
		
		// 2. 반복문을 이용 : 보통 규칙이 있는 경우
		// 숫자로 표현할 수 있는 규칙이 있을 때 반복문 사용
		int[] age2 = new int[4];
		// 할당하고 싶은 데이터 10 , 11 , 12 , 13
		// 배열의 인덱스        0 , 1 , 2 , 3
		for(int i=0 ; i<age2.length ; i++) {
			age2[i]=i+10;
		}
		System.out.println(age2[3]);
		
		// 3. 선언과 동시에 초기화
		int[] age3 = new int [] {1,2,3,4};
		int[] age4 = {5,6,7};
		// 주의 !! new를 안쓸경우 아래 같이 선언해서는 안된다.
		// 선언과 동시에 초기화하지 않을 경우 new를 사용하여야 한다.
//		int[] age5 ;
//		age5 = {9,10,11};
		System.out.println(age3[3]);
		System.out.println(age4[2]);
		
		// 배열의 출력
		int[] values = {5,6,7,8,9};
		System.out.println(values[2]);
		
		// 반복문을 활용한 배열의 출력
		String[] redFruits = {"딸기","체리","사과"};
		for(int i=0 ; i<redFruits.length ; i++) {
			System.out.print(redFruits[i]);
		}
		
		// toCharArray
		// 문자열을 문자의 배열로 데이터를 변환시키는 것
		String sentence = "HelloWorld!";
		char[] charArray;
		charArray = sentence.toCharArray();
		System.out.print("\n");
		System.out.println("=== toCharArray ===");
		for(int i=0 ; i<charArray.length ; i++) {
			System.out.println(i+" : "+charArray[i]);
		}
		for(int i=0 ; i<sentence.length() ; i++) {
			System.out.println("charAt() : "+sentence.charAt(i));
		}
		
		// 기본 for문
		int[] numbers = {1,2,3,4,5};
		for(int i=0 ; i<numbers.length ; i++) {
			System.out.println(numbers[i]);
		}
		
		// for each
		for (int num :numbers) {
			System.out.println("for each : "+num);
		}
		
		
		
	}
}
