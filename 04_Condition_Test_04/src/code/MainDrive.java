package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("첫번째 숫자 : ");
		int num1 = scan.nextInt();
		
		System.out.println("두번째 숫자 : ");
		int num2 = scan.nextInt();
		
//		첫번쨰 방법
		int sum = num1 + num2 ;		
		System.out.println("두 수의 합 : "+ sum );
		
		int sub;
		if (num1 >= num2) {
			sub = num1 - num2 ;
			
		}
		else {
			sub = num2 - num1 ;
		}
		
		System.out.println("두 수의 차 : "+sub);
		
//		두번째 방법
//		둘의 뺀 값을 일단 구하고, 그게 0보다 작으면 -1을 곱해주는 방법
		
		sub = num1-num2;
		if (sub < 0 ) {
			sub *= -1 ;			
		}
		System.out.println("두 수의 차 (두번째 방법) : " + sub);
		
		
//		세번째 방법
//		더 큰 값을 num1에 위치하도록 바꿔치기.
		
		if (num2 > num1) {
			int backUp = num1;
			num1 = num2 ;
			num2 = backUp ;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
