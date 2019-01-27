package code;

import java.util.Scanner;

public class MainDirve {

	public static void main(String[] args) {
		
		int koreanScore, mathScore, englishScore ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		koreanScore = scan.nextInt();
				
		System.out.print("수학 점수를 입력하세요 : ");
		mathScore = scan.nextInt();
		
		System.out.print("국어 점수를 입력하세요 : ");
		englishScore = scan.nextInt();
		
		int avg = (koreanScore + mathScore + englishScore) / 3 ;
		System.out.println("평균 점수는 "+ avg + "입니다.");
		
		
	}
}
