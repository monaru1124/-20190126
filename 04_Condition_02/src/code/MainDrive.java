package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		������� ���̿� Ű�� �Է¹���.
		

		
		int userAge ;
		double userHeight ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		userAge = scan.nextInt() ;
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		userHeight = scan.nextDouble() ;
		
//		Ű�� 175 �̻��̰�, ���̰� 35 ���ϸ� (Ű, ���� OK) �ܾ ���
		
		if ( userHeight >= 175 && userAge <= 35 ) {
			
			System.out.println("Ű, ���� OK");
		}

//		���� ������ Ʋ�ȴٸ�, Ȥ�� ���� ������ �����ϴ���?
		
		
		else if (userHeight >= 180 ) {
			
			System.out.println("�Ѵ� ���� X, Ű�� 180 �̻��̶� OK");
		}
		
//		�� ������ Ʋ�ȴٸ�, ���̰� 30 ��������?
		
		else if ( userAge <= 30 ) {
			
			System.out.println("�Ѵ� ���� X, Ű�� 180 X, ���� 30 ���� OK");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
