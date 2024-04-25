package pkg03_copy;
import java.util.Scanner;
public class Practice01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] score = {54,23};
		int[] scoreCopy=new int[score.length+1];
		System.out.print("길동의 점수를 입력하시요.");
		int gilScore=sc.nextInt();
		scoreCopy[2]=gilScore;
		for(int i=0 ; i<score.length ; i++) {
			scoreCopy[i]=score[i];
		}
		for(int num:scoreCopy) {
			System.out.println(num);			
		}
		sc.close();
	}
}
