package pkg04_constructor.model.vo;

public class Cake {
	// 초기화의 순서
	// 1. 자료형의 기본값
	// 2. 명시적 초기화
	// 3. 초기화 블록
	// 4. 생성자
	public String flavor = "Cheese";
	public static int price= 20000;
	// 4. 생성자
	public Cake() {
		this.flavor = "Choco";
		// this.price=48000;
	}
	// 3. 초기화 블록
	{flavor = "SweetPotato";}
	static {price=35000;}
	// -> 코드의 마지막인 초기화 블록이 아닌 초기화
	// 순서의 마지막인 생성자 값이 대입
	
}
