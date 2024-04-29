package pkg04_constructor.practice01.run;

import pkg04_constructor.practice01.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.information();
		Book b2 = new Book("홍길동전",15000,"허균");
		b2.information();
		Book b3=new Book("책","회사","사람",19000,1.5);
		b3.information();
	}
}
