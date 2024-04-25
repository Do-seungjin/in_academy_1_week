package pkg02_utilize;

public class Practice01 {
	public static void main(String[] args) {
		// 총 10명의 학생들의 출석 여부를 표현한 배열
		// 출석한 경우 = 1
		// 결석한 경우 = 0
		// 출석학생과 결석학생 수 계산,출력
		//출력 예시
		// 출석한 학생 수 : 7
		// 결석한 학생 수 : 3 
		int[] attend = {1,1,1,1,1,0,1,0,0,1};
		int sum=0;
		for(int i=0 ; i<attend.length ; i++) {
			if(attend[i]==1) {
				sum += attend [i];
			}
		}
		System.out.println(sum);
		System.out.println(attend.length-sum);
//		int sum1=0;
//		int sum2=0;
//		for(int i=0 ; i<attend.length ; i++) {
//			if(attend[i]==1) {
//				sum1+=1;
//			}else {
//				sum2+=1;
//			}
//		}
//		System.out.println("출석한 학생 수 : "+sum1);
//		System.out.println("결석한 학생 수 : "+sum2);
	}
}
