package pkg01_objArr.model.vo;

public class Academy {
	private String name;
	private String phone;
	
	public Academy() {}
	public Academy(String name,String phone) {
		this.name=name;
		this.phone=phone;
	}
	
	// private 꺼내오기 위해서 getter 이용
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	
}
