package pkg01_array;

public class Practice02 {
	public static void main(String[] args) {
		int[] numArray= {-62,107,-12,89,-35};
		int count = 1;
		for(int num:numArray) {
			if(num>50) {
				// System.out.print(num+" ");
				System.out.println(count+" : "+num);
				count=count+1;
			}
		}
	}
}
