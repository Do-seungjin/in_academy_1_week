package pkg04_homework;

public class Practice {
public void q1() {
		int[] arr= {152,180,165,158,171};
		for(int i=0 ; i<arr.length-1 ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void q2() {
		Scanner sc2=new Scanner(System.in);
		System.out.print("정수 : ");
		int ans=sc2.nextInt();
		int[] arr;
		int sum=0;
		arr=new int[ans];
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			int arr1=sc2.nextInt();
			arr[i]=arr1;
		}
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0 ; i<arr.length ; i++) {
			sum+=arr[i];
		}
		System.out.println();
		System.out.println("총 합 : "+sum);
		sc2.close();
	}
	
	public void q3() {
		Scanner sc3= new Scanner(System.in);
		int ans;
		System.out.print("정수 : ");
		ans=sc3.nextInt();
		while(ans<3 || ans%2==0) {
			System.out.println("다시 입력하세요");
			System.out.print("정수 : ");
			ans=sc3.nextInt();
		}
		int[] arr=new int[ans];
		for(int i=0 ; i<arr.length ; i++) {
			if(i<=ans/2) {
				arr[i]=i+1;
			}else {
				arr[i]=ans-i;
			}
		}
		for(int i=0 ; i<arr.length ; i++) {			
			System.out.print(arr[i]+" ");
		}
	}
		
	
	public void q4() {
		
	}
	
	public void q5() {
		
	}
	
	public void q6() {
		
	}
}

