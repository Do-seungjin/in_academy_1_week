package pkg06_homework.homework02.model.vo;

public class Rectangle {
	private int width;
	private int height;
	public Rectangle() {}
	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public int calculateRound( int width , int height ) {
		return width*2+height*2;
	}
	public int calculateArea(int width,int height) {
		return width*height;
	}
	public void printInfo(int width,int height) {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사각형의 둘레\n"+calculateRound(width, height)+"cm");
		System.out.println("2. 사각형의 넓이\n"+calculateArea(width,height)+"cm");
	}
}


