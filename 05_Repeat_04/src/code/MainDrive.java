package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		

//		Q. ����ڿ��� �޴��� �����ְ�, ���� �Է� �޴´�.
		
//		1. �α���
//		2. ȸ������
//		3. �ѷ�����
//		0. ����
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("==========�޴� ����==========");
			System.out.println("1. �α���");
			System.out.println("2. ȸ������");
			System.out.println("3. �ѷ�����");
			System.out.println("0. ����");
			System.out.println("============================");
			System.out.print("�޴��� �����ϼ��� : ");
			
			int userInput = scan.nextInt();
			
			if (userInput == 1) {
				System.out.println("�α���!");
			}
			else if(userInput == 2 ) {
				System.out.println("ȸ������!");
			}
			else if(userInput == 3) {
				System.out.println("�ѷ�����");
			}
			else if (userInput == 0) {
				System.out.println("�ý����� �����մϴ�.");
				
//				break�� �ɾ, while(true) ���ѹݺ��� Ż��.
				
				break; 
			}
			else {
				System.out.println("�߸��� ��ȣ�Դϴ�.");
			}
			
		}
		
		
		
		
	}
}
