package pkg05_practice;

public class Run {
	public static void main(String[] args) {
		
		Circle c=new Circle();
		Rectangle r = new Rectangle();
		
		// 객체 배열 할당
		Circle[] arrCir= {
				new Circle(1,2,3),
				new Circle(3,3,4)
		};
		Rectangle[] arrRec= {
				new Rectangle(-1,-2,5,2),
				new Rectangle(-2,5,2,8)
		}; 
		
		// for each 문
		System.out.println("=== circle ===");
		for(Circle a : arrCir) {
			a.draw();
		}
		System.out.println("=== rectangle ===");
		for(Rectangle a:arrRec) {
			a.draw();
		}
		
		
		
	}	
}
