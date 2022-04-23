package day04;

import java.util.Scanner;

public class day04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수 입력");
//		sc.nextInt();
		
		//사용자에게 국어, 수학, 영어 점수를 입력 받아서 평균을 출력 
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		
		
		int avg = (kor + math + eng) / 3;
		System.out.printf("당신의 과목 평균 점수는 %d 입니다 \n", avg);
		
				
		
	}

}
