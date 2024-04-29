package pkg06_homework.homework01.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {}
	
	public void changeName(String memberName) {
		this.memberName=memberName;
	}
	
	public void printName(String memberName) {
		System.out.println("너의 이름은 "+memberName);
	}
	
}
