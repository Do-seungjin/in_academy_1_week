package pkg02_field.homework01.controller;

import pkg02_field.homework01.model.vo.사원;

public class Run {
	public static void main(String[] args) {
		사원 s=new 사원();
		s.name= "김철수";
		s.team="교육운영팀";
		System.out.println("이름 : "+s.name);
		System.out.println("팀 : "+s.team);
	}
}
