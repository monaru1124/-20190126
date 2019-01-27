package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 하나 입력 : ");
		
		int userInput = scan.nextInt();
		
//		계산결과를 담을 변수
		int result = 0 ;
		
//		각 자리의 합을 계산
		
		int backUp = userInput ;
		
		while(true) {
			
			
//			12345 => 5를 추출해서 result에 더함.
//			입력 숫자의 마지막 자리를 따서, result에 더해줌.
			result += backUp % 10 ;
			
//			따낸 숫자는 날려버리고 싶다.
//			12345 => 1234 => 12345/10 => 1234 10을 나눈 값으로 대체.
			
			backUp /= 10 ;
			
//			반복문을 언제 탈출?
			if(backUp == 0) {
//				마지막 자리를 다 날려서 0이 되면 탈출.
				break;
			}
			
			
		}
		
//		합의 결과를 출력
		System.out.println(String.format("%d의 각 자리의 합은 %d입니다.",  userInput, result));
		
	}
}
