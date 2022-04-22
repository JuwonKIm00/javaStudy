package day05;

import java.util.Scanner;
public class IfTest {
	public static void main(String[] args) {
		
		
//		System.out.println("안녕");
//		System.out.println("반가워");
//		
//		if(false){
//			System.out.println("if 문 안쪽 문장 1");
//			System.out.println("if 문 안쪽 문장 2");
//		}
//		System.out.println("if 문 바깥 문장 1");
		// 사용자에게 정수를 입력 받아서 
		//짝수라면 짝수입니다
		//홀수라면 홀수 입니다 출력하기 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 정수 입력 : ");
		int num = sc.nextInt();
		
	
		if (num % 2 == 0) {		//사용자가 입력한 값이 짝수라면
			System.out.println("짝수 입니다");
			
		}else {
			
			System.out.println("홀수 입니다");
		}
		
	
	 
	}
}
