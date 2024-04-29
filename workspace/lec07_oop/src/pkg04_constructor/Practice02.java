package pkg04_constructor;

public class Practice02 {
	public void test (int i) {}	
	
	// 1번 : 매개변수 자료형이 다른 경우 오버로딩
	public void test (String str) {}
	
	// 2번 : 매개변수 개수가 다른 경우 오버로딩
	public void test (int i ,String str) {}
	
	// 3번 : 매개변수의 명칭이 다르다고 오버로딩이 성립되진 않는다 (X)
	// public void test (int num) {}
	
	// 4번 : 리턴이 다른 경우 -> 리턴은 오버로딩과 관련이 없다 (X)
	// public char test(int point) {}
	
	// 5번 : 매개변수 개수가 다른 경우 오버로딩
	public void test(int i, int k) {}
	
	// 6번 : 2번과 일치 매개변수의 명칭이 다르기만하여 오버로딩이 성립되지 않는다. (X)
	//public void test(int num,String text) {}
	
	// 7번 : 매개변수의 순서가 다른 경우 오버로딩
	public void test (String str, int i) {}

}
