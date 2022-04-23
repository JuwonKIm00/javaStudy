package day04;

public class castingTest {
	public static void main(String[] args) {
		
		System.out.println((int)3.14);
		System.out.println((double)97);
		System.out.println((char)97); // int -> char 아스키 코드 값 참조하여 바뀐다
	
		
	//	System.out.println((String)10);
		
	// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	//	Cannot cast from int to String
		
	//   -> 오류 메세지를 확인한 결과 string 타입으로는 cast 할수 없다
	// 	좀 더 살펴본 결과 String 은 대문자로 시작하는데 String 은 클래스 임을 알수 없다 
	//  문자열은 따라서 위 방법으로는 바꿀 수 없다 따라서 메소드를 활용하여 바꿔줘야 한다 
		
		// int -> String 
		// toString() : Integer 라는 클래스 안에 메소드가 존재한다 
		
		String num = Integer.toString(10);
		System.out.println(num);
	
		//String -> int
		//parseInt() :Integer 클래스 안에 존재 
		int num1 = Integer.parseInt("10");
		System.out.println(num1);
		
		//double -> String
		//toString() : Double 클래스 안에 존재 
		
		String num2 = Double.toString(10.0) + 7;
		System.out.println(num2);
		
		
		//String -> double 
		//parseDouble() : Double 클래스 안에 존재한다 
		double num3 = Double.parseDouble("3.123") + 7;
		System.out.println(num3);
		
	}
}
