package pkg01_dimensional;

public class Practice01 {
	public static void main(String[] args) {
		String arr[][]= new String[2][3];
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				arr[i][j]="("+i+","+j+")";
			}
		}
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
			System.out.print(arr[i][j]);	
			}
			System.out.println();
		}
	}
}
