package pkg02_utilize;

public class MainClass {
	public static void main(String[] args) {
		// 총합과 평균
		int[] score = {85,93,100,100,50};
		int sum = 0;
		for (int i=0 ; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("총합 : "+sum);
		int avg1 = sum/score.length;
		System.out.println("평균1 : "+avg1);
		double avg2 = sum / (double)score.length;
		System.out.println("평균2 : "+avg2);
		
		// 최대값
		int[] arr = {8,9,10,4,2};
		int max = arr[0];
		for(int i=0	 ; i<arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최대값 : "+max);
		
		// 최솟값
		int min=arr[0];
		for(int i=0 ; i<arr.length ; i++) {
			if(min > arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("최솟값 : "+min);
		
		// 오름차순
		int[] data = {8,4,1,3};
		// [인덱스 0번을 기준으로 비교]
		// 1. 8(0)과 4(1) 비교 
		// 2. 4 , 8 로 순서 변경(data[0]=4,data[1]=8)
		// 3. { 4 , 8 , 1 , 3 } -> 4(0)와 1(2) 비교
		// 4. 1 , 8 , 4 , 3 -> 1(0)과 3(3)을 비교
		// [인덱스 1번을 기준으로 비교]
		// 5. 8(1)과 4(2) 비교 -> 1,4,8,3
		// 6. 4(1)와 3(3) 비교 -> 1,3,8,4
		// [인덱스 2번을 기준으로 비교]
		// .... 즉 0과1 0과2 0과3
		// 1과2 1과3
		// 2와3 비교
		
		for(int i=0 ; i<data.length-1 ; i++) {
			for(int j=i+1 ; j<data.length ; j++) {
				// System.out.println(i+"와"+j);
				// 조건 성립 여부에 따라 위치 변경
				if(data[i]>data[j]) {
					int temp = data[i];
					data[i]=data[j];
					data[j]=temp;
				}	
			}
		}
		for(int i=0 ; i<data.length ; i++) {
			System.out.println(i+" : "+data[i]);
		}
		
		
		// 내림차순
		int[] nums= {8,4,1,3};
		// 1. 8(0)과 4(1) 비교 ->8,4,1,3
		// 2. 8(0)과 1(2) 비교 ->8,4,1,3
		// 3. 8(0)과 3(3) 비교 ->8,4,1,3
		// 4. 4(1)과 1(2) 비교 ->8,4,1,3
		// 5. 4(1)과 3(3) 비교 ->8,4,1,3
		// 6. 1(2)과 3(3) 비교 
		// 값 교환 ->8,4,3,1
		
		for(int i=0 ; i<nums.length-1 ; i++) {
			for(int j=i+1 ; j<nums.length ; j++) {
				if(nums[i]<nums[j]) {
					int temp = nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		for(int i=0; i<nums.length ; i++) {
			System.out.println(i+" : "+nums[i]);
		}
		
		
		
		
		
		
	}
}
