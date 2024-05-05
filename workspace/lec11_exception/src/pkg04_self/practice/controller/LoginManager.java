package pkg04_self.practice.controller;

import pkg04_self.practice.exception.InvalidCredentialsException;

public class LoginManager {
	
	public void login(String id,String pwd) throws InvalidCredentialsException{
		if(isVaildCredentials(id,pwd)) {
			System.out.println("성공적으로 로그인되었습니다.");
		} else {
			throw new InvalidCredentialsException("로그인이 실패하였습니다\n잘못된 아이디와 비밀번호 입니다.");
		}
			
		}
	
	private boolean isVaildCredentials(String id, String pwd) {
		if("admin".equals(id) && "admin1234!".equals(pwd)) {
			return true;
		} else {
			return false;
		}
	}
}
