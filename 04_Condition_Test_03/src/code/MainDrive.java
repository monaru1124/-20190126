package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ñ��� �⵵�� �Է��ϼ��� : ");
		int inputYear = scan.nextInt();
		
		if ( inputYear % 4 == 0 ) {
			
			if ( inputYear % 100 == 0) {
				
				if ( inputYear % 400 == 0) {
					System.out.println("���� O, 4�� ������������, 100���� ������������, 400���� ���� ������.");
					
				}
				else {
					System.out.println("���� X, 4�� ������������ 100���� ������������ 400���δ� �ȳ���������");
				}
			}
			else {
				System.out.println("���� O, 4�� ������������, 100���� �ȳ���������");
			}
		}
		else {
			System.out.println("���� X, 4�� �ȳ���������.");
			
		}
	}
}
