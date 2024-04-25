package pkg02_utilize;

public class Practice02 {
	public static void main(String[] args) {
		int[] ages = {20,18,22,19,21};
		int max = ages[1];
		int min = ages[1];
		// 가장 나이가 많은 학생 : 22
		for(int i=1 ; i<ages.length ; i++) {
			if(max<ages[i]) {
				max=ages[i];
			}
			 if(ages[i]<min){
				min=ages[i];
			}
		}
		System.out.println("가장 나이가 많은 학생 : "+max);
		System.out.println("가장 어린 학생 : "+min);
		
//		for(int i=1 ; i<ages.length ; i++) {
//			if(max<ages[i]) {
//				max=ages[i];
//			}
//		}
//		System.out.println("가장 나이가 많은 학생 : "+ max);
		
	}
}
