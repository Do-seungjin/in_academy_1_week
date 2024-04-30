package pkg03_override;

public class Cat extends Animal{
	private int chur;
	
	public Cat() {
		super();
	}
	public Cat(String name,int chur) {
		super(name);
		this.chur=chur;
	}
	
	// 부모 클래스 메서드 수정하는것
	@Override
	public void eat() {
		System.out.println(name+"가 츄르를 "+chur+"개 먹습니다.");
	}
	// 자식 클래스 실행시 수정 내용이 우선 출력
	
	
	
}
