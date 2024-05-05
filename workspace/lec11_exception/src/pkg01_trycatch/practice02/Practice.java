package pkg01_trycatch.practice02;

public class Practice {
	public void printStrLength(String str) {
		try {
			System.out.println(str.length());			
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생 : "+e.getMessage());
		}
	}
}
