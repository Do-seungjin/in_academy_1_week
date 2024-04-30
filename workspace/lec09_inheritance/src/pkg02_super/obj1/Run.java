package pkg02_super.obj1;

public class Run {
	public static void main(String[] args) {
	// 자식 클래스로 인스턴스 생성할때 부모 클래스의 기본 생성자가 먼저 호출되고, 자식 클래스의 생성자 호출	
		Parent p1 = new Parent();
		Parent p2 = new Parent(23);
		System.out.println("=====================");
		// 자식 생성자(기본, 매개변수)호출할때 
		// 무조건 부모 기본생성자 호출
		Child c1 = new Child();
		System.out.println("==== c1, c2 구분 ====");
		Child c2 = new Child(56);
		
		Child c3 = new Child();
		c3.childMethod(400);
	
	}
}
