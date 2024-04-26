package pkg03_method.practice01.controller;
import pkg03_method.practice01.model.vo.Car;
import pkg03_method.practice01.model.vo.ParamClass;
import pkg03_method.practice01.model.vo.ReturnClass;
public class Run {
//	public static void main(String[] args) {
//		Declare d=new Declare();
//		d.run();
//	}
	public static void main(String[] args) {
		ReturnClass rc=new ReturnClass();
		rc.greet();
		int num1 = rc.generateNumber();
		System.out.println(num1);
		rc.createArray(); // 배열의 주소값;
		System.out.println(rc.createArray());
		int[]arr=rc.createArray();
		for(int num:arr) {
			System.out.print(num+" ");
		}
		rc.createCar();
		// 반환형 -> 메소드 호출 구문
		System.out.println();
		ParamClass pc =new ParamClass();
		pc.greet();
		pc.add(200,34);
		pc.printArray(new int[] {1,2});
		pc.printCar(new Car());
		pc.mixParam(3, "Hello");
	}
	
	
}
