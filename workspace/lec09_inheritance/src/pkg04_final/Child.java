package pkg04_final;

//public class Child extends Parent01{

public class Child extends Parent02{
	
	@Override
	public void method() {
		System.out.println("오버라이드 가능");
	}

	// final이 붙어있는 메소드는 자식 클래스에서 오버라이드 불가능하다.
//	@Override
//	public void method2() {
//		System.out.println("오버라이드 불가능!!");
//	}
	
}