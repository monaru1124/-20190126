package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

//		사용자에게서 시험 점수를 입력받자. (점수는 정수형태)
//		90 이상이면 A, 80이상이면 B, 70이상이면 C
				
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		
		int userScore = scan.nextInt() ;
		
		if (userScore >= 90) {
			
			System.out.println("A");
			
		}
		
		else if (userScore >= 80) {
//			80~89 
			System.out.println("B");
		}
		
		else if (userScore >= 70 ) {
//			70~79
			System.out.println("C");
		}
		
//		여기까지 전부 틀렸다면 ? 일괄처리
		else {
			System.out.println("F");
			
		}
		

		
		
		

		
	}
}
