package code;

import java.util.Scanner;

public class MainDirve {

	public static void main(String[] args) {
		
		int koreanScore, mathScore, englishScore ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		koreanScore = scan.nextInt();
				
		System.out.print("���� ������ �Է��ϼ��� : ");
		mathScore = scan.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		englishScore = scan.nextInt();
		
		int avg = (koreanScore + mathScore + englishScore) / 3 ;
		System.out.println("��� ������ "+ avg + "�Դϴ�.");
		
		
	}
}
