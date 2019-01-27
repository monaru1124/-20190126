package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		

//		Q. 사용자에게 메뉴를 보여주고, 값을 입력 받는다.
		
//		1. 로그인
//		2. 회원가입
//		3. 둘러보기
//		0. 종료
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("==========메뉴 선택==========");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 둘러보기");
			System.out.println("0. 종료");
			System.out.println("============================");
			System.out.print("메뉴를 선택하세요 : ");
			
			int userInput = scan.nextInt();
			
			if (userInput == 1) {
				System.out.println("로그인!");
			}
			else if(userInput == 2 ) {
				System.out.println("회원가입!");
			}
			else if(userInput == 3) {
				System.out.println("둘러보기");
			}
			else if (userInput == 0) {
				System.out.println("시스템을 종료합니다.");
				
//				break를 걸어서, while(true) 무한반복을 탈출.
				
				break; 
			}
			else {
				System.out.println("잘못된 번호입니다.");
			}
			
		}
		
		
		
		
	}
}
