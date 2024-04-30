package pkg05_practice;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {
		super();
	}
	public Rectangle(int x,int y,int width, int height) {
		super(x,y);
		this.width=width;
		this.height=height;
	}
	public void draw() {
		super.draw();
		System.out.println("사각형 면적 : "+(width*height));
		System.out.println("사각형 둘레 : "+2*(width+height));
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
}
