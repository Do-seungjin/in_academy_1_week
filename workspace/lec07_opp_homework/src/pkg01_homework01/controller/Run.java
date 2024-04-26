package pkg01_homework01.controller;

import pkg01_homework01.model.vo.Calculate;

public class Run {
	public static void main(String[] args) {
		Calculate cc = new Calculate();
		cc.method1("Hello", "World");
		cc.method2(14, 10);
	}
}
