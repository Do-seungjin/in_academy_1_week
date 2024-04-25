package pkg04_homework;
import java.util.Scanner;
public class Practice {
	
	public void practice01() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수(1~50) : ");
		int su1 = sc1.nextInt();
		int sum=0;
		if(1<=su1 && su1<=50) {
			for(int i=1 ; i<= su1 ; i++) {
				if(i%2==0) {
					sum+=i;
				}	
			}
			System.out.println("합계 : "+sum);
		}else {
			System.out.println("1~50 사이의 정수를 입력하세요");
		}
		sc1.close();
	}
		
	
	public void practice02() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("숫자 : ");
		int su = sc2.nextInt();
		if(1<=su && su<=9) {
			for(int i=su; i<=9 ; i++) {
				System.out.println("=== "+i+"단 ===");
				for(int j=1 ; j<=9 ; j++) {
					System.out.println(i+" * "+j+" = "+(i*j));
				}
			}
		}else if(su>9){
			System.out.println("9 이하의 숫자를 입력해주세요.");
		}else {
			System.out.println("양수만 입력해주세요.");
		}
		sc2.close();
	}
	
	public void practice03() {
		Scanner sc2 = new Scanner(System.in);
		for(String str ; ; ) {
			System.out.print("입력 : ");
			str=sc2.nextLine();
			System.out.println(str);
			if(str=="탈출") {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
	
	public void practice04() {
		Scanner sc4=new Scanner(System.in);
		String str;
		do{	
			System.out.println("게임을 실행합니다!");
			System.out.print("게임을 다시 플레이하시겠습니까? (yes/no)");
			str=sc4.next();
		}
		while(!str.equals("no"));
			System.out.println("게임을 종료합니다.");
			sc4.close();
	}
	
	public void practice05() {
		Scanner sc5 = new Scanner(System.in);
		int su5;
		int sum5=0;
			do {
				System.out.print("숫자(0을 입력하면 종료) : ");
				su5=sc5.nextInt();
				if(su5>=0) {
					sum5+=su5;
				}else {
					System.out.print("숫자(0을 입력하면 종료) : ");
					su5=sc5.nextInt();
				}
			} while (!(su5==0)); {
				System.out.println("양수의 합계 : "+sum5);
			}
		sc5.close();
	}
	
	public void practice06() {
		System.out.println("    *    ");
		System.out.println("   ***   ");
		System.out.println("  *****  ");
		System.out.println(" ******* ");
		System.out.println("*********");
		
	}
	
	public void practice07() {
		Scanner sc7=new Scanner(System.in);
		int su7;
		while(true) {
			System.out.print("정수 : ");
			su7=sc7.nextInt();
			if(su7>=1) {
				if(su7%2==0) {
					System.out.println("수");
				}else {
					System.out.println("박");
				}
			}else {
				System.out.println("양수가 아닙니다.");
			}
			
			
		}
	}
	
	public void practice08() {
		Scanner sc8=new Scanner(System.in);
		String str8;
		int sum=0;
		String strChar;
		String re;
		char char1;
		char char2;
		do {
			sum=0;
			System.out.print("문자열 : ");
			str8=sc8.next();
			System.out.print("문자 : ");
			strChar=sc8.next();
			char1=strChar.charAt(0);
			for(int i=0 ; i<str8.length(); i++) {
				if(char1==str8.charAt(i)) {
					sum++;
				}	
			}
			System.out.println("포함된 개수 : "+sum);
			System.out.print("더 하시겠습니까? (y/n) : ");
			re=sc8.next();
			char2=re.charAt(0);
				if (char2 != 'y' && char2 != 'n') {
			    System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
			    System.out.print("더 하시겠습니까? (y/n) : ");
				re=sc8.next();
				char2=re.charAt(0);
			}
		}while(char2 != 'n');
		sc8.close();
	}
}

