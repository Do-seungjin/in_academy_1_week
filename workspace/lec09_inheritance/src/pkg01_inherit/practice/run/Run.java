package pkg01_inherit.practice.run;

import pkg01_inherit.practice.model.vo.Employee;
import pkg01_inherit.practice.model.vo.Manager;

public class Run {
	public static void main(String[] args) {
		Manager mng=new Manager("김철수","영업부");
		mng.printInfo();
		mng.printDepartment();
	}
}
