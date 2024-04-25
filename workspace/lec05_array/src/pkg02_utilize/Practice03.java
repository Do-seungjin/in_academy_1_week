package pkg02_utilize;

public class Practice03 {
	public static void main(String[] args) {
		int[] ages = {20,18,22,19,21};
		// 오름차순
		
		for(int i=0 ; i<ages.length-1 ; i++) {
			for(int j=i+1 ; j<ages.length ; j++) {
				if(ages[i]>ages[j]) {
					int temp= ages[i];
					ages[i]=ages[j];
					ages[j]=temp;
				}
			}
		}
		for(int i=0 ; i<ages.length ; i++) {
			System.out.println(i+" : "+ages[i]);
		}
	}
}

