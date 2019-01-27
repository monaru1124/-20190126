package code;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("소수인지 궁금한 숫자를 입력 : ");
		
		int userInput = scan.nextInt();
		
		boolean primeNumeResult = true ;
		int divider = 0; // 소수가 아닐떄 나눠떨어지는 숫자를 저장
		
//		받아온 숫자가 소수인지 아닌지?
		
//		평균속도를 2배 빠르게? => 작업량을 반으로 줄이자. => 반복횟수를 반으로 줄인다.
//		반복문의 조건식을 수정하자.  
//		for (int i = 2 ; i < userInput / 2  ; i++)
		
		
		for (int i = 2 ; i < userInput ; i++) {
			
			
//			입력값을 2부터 자기자신 직전까지 나눠봄.
			if(userInput % i == 0) {
				
//				나눠떨어지는 숫자를 발견! => 소수가 아니게 되는 숫자를 찾음!
				
				primeNumeResult = false;
				divider = i;
				break;
			}
			
			
		}
		
		
		
		
		
		
//		* 내풀이
//		for(int i = userInput-1 ; i > 1 ; i--) {
//			if ( userInput % i == 0) {
//				divider = i ;
//				primeNumeResult = false;
//				break;
//			}
//			else  {
//				primeNumeResult = true;
//			}
//		}

		
		
//		판단 결과를 출력 => 상황에 따라 다른 결과를 출력 (소수가 맞을떄, 아닐때)
		
		if (primeNumeResult ) {
			System.out.println("소수가 맞습니다.");
			
		}
		else {
			System.out.println("소수가 아닙니다.");
			System.out.println(String.format("%d로 나눠떨어집니다.", divider));	
		}
		
		
		
		
		
		
		
		
	}
}
