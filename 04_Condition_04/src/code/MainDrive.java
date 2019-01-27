package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		점수와 등수를 입력받자.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt() ;
		System.out.print("등수를 입력하세요 : ");
		int rank = scan.nextInt() ;
		
//		90점이 넘는다 => 5등 이내면 A+, 아니면 A0
		if ( score >= 90) {
			if (rank <=5) {
				System.out.println("A+");
			}
			else {
				System.out.println("A0");
			}
		
						
		}
	}
}
