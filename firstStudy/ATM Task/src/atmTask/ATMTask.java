package atmTask;

import java.util.Scanner;
import java.util.Random;

public class ATMTask {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int code = 123456;
			
		while(true) {
			System.out.println("----초기화면----");
			System.out.println("1. ATM 이용하기 \n2. 프로그램 종료하기");
			System.out.print("번호 입력 : ");
			int firstChoice = sc.nextInt();
			
			
			if(firstChoice ==1) {
				
				
					int choice =0;
					int account1 = 0, account2 = 0, account3 = 0;
					int money = 0;
					int password = 0;
					
					
				while(true) {		
					
						System.out.println();
						System.out.println();
						System.out.println("Atm기 입니다");
						System.out.println("----메인화면----");
						System.out.println("1. 계좌 발급받기 \n2. 입금하기 \n3. 출금하기 \n4. 잔액확인하기 \n5. 나가기 ");
						System.out.print("번호 입력 : ");
					
						choice = sc.nextInt();
					
						if(choice ==1) {
							System.out.println("계좌번호가 발급됩니다");
							account1 = r.nextInt(10,99);
							account2 = r.nextInt(1000,9999);
							account3 = r.nextInt(1000,9999);
						
							System.out.println("발급된 계좌번호는 ");
							System.out.printf("\t %d - %d - %d 입니다 \n", account1, account2, account3);
						
							System.out.println("비밀번호를 설정하십시오 \n보안을 위해 0000을 제외한 4자리 숫자로 입력해주세요");
							System.out.print("비밀번호 입력 :");
							password = sc.nextInt();
							
							if(password <= 0 || password > 9999 ) {
								System.out.println("보안을 위해 비밀번호는 0000을 제외한 4자리 숫자이어야 합니다 \n초기화면으로 돌아갑니다 ");
								break;
								
							}
							
							System.out.println();
							System.out.print("비밀번호 확인 : ");
							
							int i;
							for(i =0; i <3; i++) {
								System.out.printf("3번째 중 %d 번째 \n", i+1);
								int checkPassword = sc.nextInt();
								
								if(password == checkPassword) {
									System.out.println("비밀 번호 설정이 완료되었습니다 메인화면으로 돌아갑니다");
									break;
									// 여기서 맞으면 계쏙 진행 
								}else {
									System.out.println("비밀번호가 틀렸습니다 다시 입력해주세요");
								}
								
							}
							
							if( i == 3 ) {
								System.out.println("비밀번호 3회 오류로 초기 화면으로 돌아갑니다 \n");
								break;
							}
						
						
						}else if(choice == 2) {
							
							if(password == 0) {
								System.out.println("아직 계좌 개설 전 입니다");
								System.out.println("메인 메뉴로 돌아가 개좌를 개설해 주십시오");
								System.out.println("메인 메뉴로 돌아갑니다 ");
								continue;
							}
					
							
							
							System.out.println();
							System.out.println("입금하기 메뉴입니다");
							
							System.out.println("계좌번호를 입력 해주세요");			
							System.out.println("\n계좌 번호 입력(-는 생략)");
							
							System.out.print("처음 두자리 : ");
							int accountCheck1 = sc.nextInt();
							
							System.out.print("중간 네자리 : ");
							int accountCheck2 = sc.nextInt();
							
							System.out.print("마지막 네자리: ");
							int accountCheck3 = sc.nextInt();
							
							if(account1 == accountCheck1 && account2 == accountCheck2 && account3 == accountCheck3 ) {
									//계좌가 맞을 경우 
								System.out.println("\n 계좌가 확인되었습니다 비밀번호를 입력해주세요");
								int j;
								for(j =0; j <3; j++) {
									System.out.printf("3번째 중 %d 번째 \n", j+1);
									System.out.print("비밀번호 입력 :");
									int passwordCheck = sc.nextInt();
									
									if(password == passwordCheck) {
										System.out.println("입금하실 금액을 입력해주세요");
										System.out.print("금액 입력 : ");
										
										int deposit = sc.nextInt();
										money += deposit;
										
										System.out.printf("%d 원이 입금 되었습니다, 현재 잔액은 %d원 입니다 \n", deposit, money);
										System.out.println("메인 메뉴로 돌아갑니다");
										break;
									
									}else {
										System.out.println("비밀번호가 틀렸습니다 다시 입력해주세요");
									}
									
								}
								
								if( j == 3 ) {
									System.out.println("비밀번호 3회 오류로 초기 화면으로 돌아갑니다 \n");
									break;
								}	
								
							}else { //계좌가 틀렸을 경우
								System.out.println("계좌 번호가 옳지 않습니다 메인메뉴로 돌아갑니다");
								
							}
							
		
						}else if(choice == 3) {
							if(password == 0) {
								System.out.println("아직 계좌 개설 전 입니다");
								System.out.println("메인 메뉴로 돌아가 개좌를 개설해 주십시오");
								System.out.println("메인 메뉴로 돌아갑니다 ");
								continue;
							}
							System.out.println();
							System.out.println("출금하기 메뉴입니다");
							
							System.out.println("계좌번호를 입력 해주세요");			
							System.out.println("\n계좌 번호 입력(-는 생략)");
							
							System.out.print("처음 두자리 : ");
							int accountCheck4 = sc.nextInt();
							
							System.out.print("중간 네자리 : ");
							int accountCheck5 = sc.nextInt();
							
							System.out.print("마지막 네자리: ");
							int accountCheck6 = sc.nextInt();
							
							if(account1 == accountCheck4 && account2 == accountCheck5 && account3 == accountCheck6 ) {
									//계좌가 맞을 경우 
								System.out.println("\n 계좌가 확인되었습니다 비밀번호를 입력해주세요");
								int j;
								for(j =0; j <3; j++) {
									System.out.printf("3번째 중 %d 번째 \n", j+1);
									System.out.print("비밀번호 입력 :");
									int passwordCheck = sc.nextInt();
									
									if(password == passwordCheck) {
										System.out.println("출금하실 금액을 입력해주세요");
										System.out.print("금액 입력 : ");
										
										int withdraw = sc.nextInt();
										
										if(withdraw <= money ) {
											money -= withdraw;
											System.out.printf("%d 원이 출금 되었습니다, 남아있는 잔액은 %d 원입니다\n", withdraw, money);
											System.out.println("메인 메뉴로 이동 합니다");
											break;
											
										}else {//돈이 모자르다면 
											System.out.println("잔액이 부족합니다 \n 메인메뉴로 이동합니다");
											break;
										}
									
									
									}else {
										System.out.println("비밀번호가 틀렸습니다 다시 입력해주세요");
									}
									
								}
								
								if( j == 3 ) {
									System.out.println("비밀번호 3회 오류로 초기 화면으로 돌아갑니다 \n");
									break;
								}	
								
							}else { //계좌가 틀렸을 경우
								System.out.println("계좌 번호가 옳지 않습니다 메인메뉴로 돌아갑니다");
								
							}
							
		
						}else if(choice == 4) {
							if(password == 0) {
								System.out.println("아직 계좌 개설 전 입니다");
								System.out.println("메인 메뉴로 돌아가 개좌를 개설해 주십시오");
								System.out.println("메인 메뉴로 돌아갑니다 ");
								continue;
							}
							
							System.out.println();
							System.out.println("잔액 확인 메뉴입니다");
							System.out.printf("현재 고객님의 잔액은 %d원입니다 ",money);
						
						}else if(choice == 5){
							System.out.println();
							System.out.println("초기화면으로 돌아갑니다");
							break;
						}else {
							System.out.println("1 부터 5 사이의 숫자를 입력해주세요");
						}
					
				
				}
				
				
				
			}else if(firstChoice == 2) {
				System.out.println("프로그램을 종료하기 위해 프로그램 비밀번호 6자리를 입력해주세요");
				System.out.print("비밀번호 입력 : ");
				int CodePassword = sc.nextInt();
				if(CodePassword == code) {
					break;
				}else {
					System.out.println("비밀 번호가 틀렸습니다 초기화면으로 돌아갑니다 \n");
				}
				
			}else {
				System.out.println("1 또는 2를 입력해주세요");
			}
				
				
		
				
		}// 프로그램 나가는 괄호 

			System.out.println("프로그램이 종료되었습니다\n수고하셨습니다");

		
	} //main 함수 
}//패키지 닫는 괄호

