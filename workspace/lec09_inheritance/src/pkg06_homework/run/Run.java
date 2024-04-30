package pkg06_homework.run;
import java.util.Scanner;

import pkg06_homework.model.vo.Employee;
import pkg06_homework.model.vo.Student;
public class Run {
	public static void main(String[] args) {
		Student s=new Student();
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		Student[] arrStu=new Student[3];
		Employee[] arrEmp=new Employee[10];
		arrStu[0]=new Student("김철수",20,178.2,70.0,1,"정보시스템공학과");
		arrStu[1]=new Student("이영희",23,167.0,54.0,4,"물리학과");
		arrStu[2]=new Student("홍길동",21,197.6,86.0,2,"경영학과");
		for(Student a : arrStu) {
			System.out.println(a.toString());
		}
		String str=sc.next();
		
	}
}
