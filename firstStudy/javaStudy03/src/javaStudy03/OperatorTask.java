package javaStudy03;

//1. 사용자에게 두자리수 정수를 입력 받고, 십의 자리와 일의 자리를 출력하는 프로그램 만들기 


import java.util.Scanner;

public class OperatorTask {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1. 십의 자리와 일의자리를 출력하기'
		System.out.print("두자리수 정수 : ");
		int num = sc.nextInt();
		
		System.out.printf("십의 자리 : %d\n", num / 10);
		System.out.printf("일의 자리 : %d\n", num % 10 );
		
		
		//2.코인 노래방 프로그램, 한 곡 300원 , 입력할 수 있는 곡 수와 잔돈 출력 
		
		System.out.print("금액 입력 : ");
		int money = sc.nextInt();
		
		System.out.printf("부를 수 있는 곡 수 : %s \n", money / 300);
		System.out.printf("잔돈 : %s\n", money %300);
		
	
		
		
	}

}
