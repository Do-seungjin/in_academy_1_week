package pkg05_practice;

public class Circle extends Point{
	private int radius;
	private static double PI=3.14;
	
	public Circle() {
		super();
	}
	public Circle(int x,int y,int radius) {
		super(x,y);
		this.radius=radius;
	}
	
	public void draw() {	
		super.draw();
		System.out.printf("원의 면적 : %.1f",(PI*radius*radius));
		System.out.println();
		System.out.println("원의 둘레 : "+(PI*radius*2));
	}
	
	public int getRadius() {
		return radius;
	}
	
}
