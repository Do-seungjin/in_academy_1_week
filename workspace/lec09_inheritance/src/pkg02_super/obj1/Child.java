package pkg02_super.obj1;

public class Child extends Parent{
	private int b=1;
	public Child() {
		// 부모 기본생성자가 없을시 다른 생성자를 불러오는 super(5);로 부모 매개변수 생성자라도 사용
		// 종속관계를 표현하기 위해 필수적이진 않지만 관행적으로 super();사용
		super();
		System.out.println("자식 기본 생성자");
	}
	public Child(int b) {
		super(5);
		System.out.println("자식 매개변수 생성자: "+b);
		
	}
	
	public void childMethod(int b) {
		System.out.println("b : "+b);
		System.out.println("this.b : "+this.b);
		System.out.println("super.b : "+super.b);
	}
	
	
}
