package pkg03_loop;

public class Practice10 {
	public static void main(String[] args) {
		String text="생 일 축 하 해 !";
		for(int i=0 ; i<text.length() ; i++) {
			char ch = text.charAt(i);
			if(ch == ' ') {
				continue;
			}
			System.out.print(ch);
		}
		
		
			
	}
}

