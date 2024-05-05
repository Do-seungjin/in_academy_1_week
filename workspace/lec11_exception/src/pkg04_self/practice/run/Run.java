package pkg04_self.practice.run;
import java.util.Scanner;

import pkg04_self.practice.controller.LoginManager;
import pkg04_self.practice.exception.InvalidCredentialsException;
public class Run {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디 : ");
		String str1 = sc.next();
		System.out.print("비밀번호 : ");
		String str2 = sc.next();
		
		LoginManager log = new LoginManager();
		try {
		log.login(str1, str2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
