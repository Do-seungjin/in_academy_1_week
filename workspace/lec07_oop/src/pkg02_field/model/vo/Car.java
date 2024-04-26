package pkg02_field.model.vo;

public class Car {
	// [접근제한자] [예약어] 자료형 변수명 [= 초기값];
	//          			초기값이 있을수도 있고 없을수도 있다
	// 차 이름 -> 전체
	public static String name = "avante";
	// 브랜드 -> 전체
	// 인스턴스 변수 -> 클래스 변수
	public static String brand = "BMW";
	// 색깔 -> 다른 패키지에서는 쓸 수 없다
	protected String color;
	// 제조년도 -> 현재 클래스 안에서만 사용(Car 클래스)
	private int year;
	// 가격 -> default : 같은 패키지까지 쓸 수 있다
	int price;
	
	// 인스턴스 변수 year 초기화
	{year = 2024;}
	
	// 클래스 변수(static) brand 초기화
	static {brand = "KIA";}
	
	
}
 