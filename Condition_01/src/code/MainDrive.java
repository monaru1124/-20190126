package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		사용자에게 시험 점수를 입력받아 70점 이상이라면 "합격입니다!"라는 문장 출력
		
		Scanner scan = new Scanner(System.in) ;
			
		System.out.print("점수를 입력하세요 : ");
				
		int userScore = scan.nextInt();
		
		
		if(userScore >= 70) {
			
			System.out.println("합격입니다!");
			
		}
		
	}
}
