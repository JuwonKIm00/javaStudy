package day05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	/* System.out.print("정수 1 입력 : ");
	int num1 = sc.nextInt();
	
	System.out.print("정수 2 입력 : ");
	int num2 = sc.nextInt();
	
	int res = num1 > num2 ? num1 : num2 ;
	
*/
	
//	
//	System.out.print("나이 입력 : " );
//	int age = sc.nextInt();
//	
//	String res = (10 <= age && age <=25) ? "1000원" : "무료";
//		
//	System.out.println(res);
//	
	
//	System.out.print("키 입력 : ");
//	int height = sc.nextInt();
//	
//	System.out.print("나이 입력 : ");
//	int age = sc.nextInt();
//	
////	System.out.println( height >= 120 && age >= 8 ? "탑승 가능 " : "탑승 불가 ");
////	System.out.println( height < 120 || age < 8 ? "탑승 불가" : "탑승 가능" );
////	System.out.println( !(height >= 120 && age >= 8) ? "탑승 불가 " : "탑승 가능 ");
//	
//	
	
//	System.out.print("라면 갯수 : ");
//	int ramen = sc.nextInt();
//	
//	//라면을 20으로 나누었을때 나머지가 있다면 
//	int boxCnt = ramen % 20 != 0 ? (ramen / 20) + 1 : (ramen / 20);
//	System.out.printf("총 %d개의 상자가 필요합니다 \n", boxCnt);
//	
	
//	System.out.print("이름을 입력하시오 : ");
//	String name = sc.nextLine();
//	
//	String res = name.equals("관리자") ? "관리자 모드로 전환합니다" : name + "님 환영합니다";
//	System.out.println(res);
//	
	
	// 두 정수를 입력 받아서 둘 중 더 큰 수를 출력하는 프로그램 , 만약 같다면 같다 라고 출력하기 
	
	System.out.print("정수 1 입력 : ");
	int num1 = sc.nextInt();
	
	System.out.print("정수 2 입력 : ");
	int num2 = sc.nextInt();
	
	String res = num1 > num2 ? num1 + "" : (num1 == num2 ? "같다" : num2 + "");
	System.out.println("결과 : " +  res);
	
	
	}

}
