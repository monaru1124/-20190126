package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		������ ����� �Է¹���.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int score = scan.nextInt() ;
		System.out.print("����� �Է��ϼ��� : ");
		int rank = scan.nextInt() ;
		
//		90���� �Ѵ´� => 5�� �̳��� A+, �ƴϸ� A0
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
