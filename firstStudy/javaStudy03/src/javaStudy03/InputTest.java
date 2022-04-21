package javaStudy03;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//next() : 입력을 받아서 값을 String 타입으로 받아온다 
		//nextLine() : 입력을 받은 값을 String 타입으로 받아온다(한줄)
		//nextInt() : 정수를 입력받아 int 타입으로 받아온다 
		
		
		//이름과 나이를 입력 받아 출력하기
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.printf("%s 님 환영합니다 \n", name);
		System.out.printf("%s 님의 나이는 %d 살입니다 \n", name, age);
		
		
		
	}

}
