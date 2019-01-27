package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		누적 합산을 저장할 변수.
		int sum1 = 0 ;
		
				
		for (int i =0 ; i<100 ; i++) {
//			i : 0 / 1 증가, i : 99 / 100 증가
//			자기자신을 증가시키는 연산자인 +=을 활용 (대입연산자 참조)
			sum1 += (i+1) ;
			
		}
		System.out.println(String.format("1~100의 합 : %d",sum1));
		
		
		
		
		
		
//		2번 문제 결과 저장 변수
		int sum2 = 0 ;
		
		for (int i = 0 ; i < 100 ; i++ ) {
//			더하려는 숫자가 짝수니?
			if ((i+1) % 2 == 0) {
				sum2 += (i+1);
			}
//			짝수가 아니라면? 아무 것도 안하니까, 작성할 필요도 없다.
		
		}
		
		System.out.println(String.format("1~100의 짝수 합 : %d",sum2));
			
		
		
//		3번 문제 결과 저장할 변수
		int sum3 =0; 
		
//		입력값 받기 위한 작업
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int userInput = scan.nextInt();
		
		
		for (int i = 0 ; i < userInput ; i++) {
			if ((i+1) % 2 != 0 ) {
				sum3 += (i+1);
			}
		}
		System.out.println(String.format("1~%d 중 홀수의 합 : %d",userInput,sum3));
	}
}
