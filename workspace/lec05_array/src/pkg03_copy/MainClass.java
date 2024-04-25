package pkg03_copy;

public class MainClass {
	public static void main(String[] args) {
		// 얕은 복사
		// Stack에 있는 주소값을 복사하는 것
		// 하나 수정시 다른 것도 같이 수정됨 공동체
		int[] arr1 = {8,4,1,3};
		int[] arr2=arr1;
		arr2[3]=12345;
		for(int num:arr2) {
			System.out.println("arr2 : "+num);
		}		
		for(int num : arr1) {
			System.out.println("arr1 : "+num);
		}
		
		// 깊은 복사 (실질적인 복사)
		// 하나 수정시 수정한 부분만 수정됨
		// 각자 다른 특징을 갖는다
		int[] arr3 = {5,6,7,8};
		int[] arr4 = new int[arr3.length];
		for(int i=0 ; i<arr3.length ; i++) {
			arr4[i] = arr3[i];
		}
		arr4[3]=12345;
		for(int num:arr3) {
			System.out.println("arr3 : "+num);
		}
		for(int num:arr4) {
			System.out.println("arr4 : "+num);
		}
		
		// 랜덤값 (난수)
		// 0.0 부터 0.999999999999999....까지 숫자 랜덤으로 뽑는다
		double basic = Math.random();
		System.out.println(basic);
		
		// 10 곱하기 : 0.0부터 9.999..
		// 100 곱하기 : 0.0부터 99.999..
		// 최솟값 ~ 최대값 -> (최대값-최소값+1)
		double hundred = basic * 100;
		System.out.println(hundred);
		
		// 형변환
		int casting = (int) hundred;
		System.out.println(casting);
		
		// 최소값 더하기
		// 0~99 -> 1~100
		int add = casting +1;
		System.out.println(add);
		
		int randomNum=(int)(Math.random() * 100) + 1;
		System.out.println(randomNum);
		
		for(int i=0 ; i<3 ; i++) {	
			int ran = (int)(Math.random()*6)+40;
			System.out.println("40~45 : "+ran);
		}
		
	}
	
}
