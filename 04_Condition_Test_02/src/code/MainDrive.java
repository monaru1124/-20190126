package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		
		int inputNum = scan.nextInt() ;
		
//		Ȧ��? ¦��? ���ڸ� 2�� �������� �������� == 0 ¦��, �ƴϸ� Ȧ��
		
		if (inputNum % 2 == 0) {
//			���ڸ� 2�� ���� �������� 0�� ���ٸ�? ¦���� �ش��ϴ� �б�.
			System.out.println("¦���Դϴ�.");
		}
		
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
		
		
		
	}
}
