package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		
		int inputNum = scan.nextInt() ;
		
//		홀수? 짝수? 숫자를 2로 나눴을때 나머지가 == 0 짝수, 아니면 홀수
		
		if (inputNum % 2 == 0) {
//			숫자를 2로 나눈 나머지가 0과 같다면? 짝수에 해당하는 분기.
			System.out.println("짝수입니다.");
		}
		
		else {
			System.out.println("홀수입니다.");
		}
		
		
		
		
	}
}
