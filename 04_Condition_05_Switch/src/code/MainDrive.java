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
		
		System.out.println("==========메뉴 선택==========");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 둘러보기");
		System.out.println("0. 종료");
		System.out.println("============================");
		System.out.print("메뉴를 선택하세요 : ");
		
		int userInput = scan.nextInt();
		
		
		switch (userInput) {
		case 1 :
//			userInput에 들어있는 값이 1일 경우 실행할 내용
			System.out.println("로그인 화면으로!");
			System.out.println("이동합시다!");
					
			break;
			
		case 2 :
//			userInput의 값이 2일때
			System.out.println("회원가입 화면");
			break;			
		case 3:
			System.out.println("둘러보기!");
			break;
		case 0 :
			System.out.println("시스템 종료");
			break;			
		default: // if로 따지면 else 같은 존재.
			System.out.println("잘못된 입력입니다.");
			break;
		}
		
		
		
		
		
		
		
		
		
		
	}
}
