package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		����ڿ��� ���� ������ �Է¹޾� 70�� �̻��̶�� "�հ��Դϴ�!"��� ���� ���
		
		Scanner scan = new Scanner(System.in) ;
			
		System.out.print("������ �Է��ϼ��� : ");
				
		int userScore = scan.nextInt();
		
		
		if(userScore >= 70) {
			
			System.out.println("�հ��Դϴ�!");
			
		}
		
	}
}
