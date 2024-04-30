package pkg03_override.a;

public class Student {
	private int id;
	private String name;
	
	public Student() {}
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	// 주소값을 비교하지말고 equals를 오버라이드해서 id와 name이 똑같으면 일치합니다를 출력하는것으로 수정
	@Override
	public boolean equals(Object o) {
		Student s = (Student)o;
		if(s.id == this.id && s.name.equals(this.name)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "학생의 이름 : "+name+", 학생의 번호 : "+id;
	}
	
}
