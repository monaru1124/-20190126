package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

//		����ڿ��Լ� ���� ������ �Է¹���. (������ ��������)
//		90 �̻��̸� A, 80�̻��̸� B, 70�̻��̸� C
				
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		
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
		
//		������� ���� Ʋ�ȴٸ� ? �ϰ�ó��
		else {
			System.out.println("F");
			
		}
		

		
		
		

		
	}
}
