package pkg02_type;

public class Practice02 {

	public static void main(String[] args) {
		// String fullName = "황보솔"; 이라 해도 된다.
		String fullName = new String("황보솔");
		char name=fullName.charAt(2);
		System.out.println(fullName+"의 이름은 \""+name+"\"입니다.");
		char firstName = fullName.charAt(0);
		char secondName = fullName.charAt(1);
		System.out.println(fullName+"의 성은 "+firstName+secondName+"입니다.");
		
		// fast way but 더 깊게 생각하도록 하자
		String newName="황보솔";
		System.out.println(newName.charAt(0));
				

	}

}
