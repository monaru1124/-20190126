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
		
		System.out.println("==========�޴� ����==========");
		System.out.println("1. �α���");
		System.out.println("2. ȸ������");
		System.out.println("3. �ѷ�����");
		System.out.println("0. ����");
		System.out.println("============================");
		System.out.print("�޴��� �����ϼ��� : ");
		
		int userInput = scan.nextInt();
		
		
		switch (userInput) {
		case 1 :
//			userInput�� ����ִ� ���� 1�� ��� ������ ����
			System.out.println("�α��� ȭ������!");
			System.out.println("�̵��սô�!");
					
			break;
			
		case 2 :
//			userInput�� ���� 2�϶�
			System.out.println("ȸ������ ȭ��");
			break;			
		case 3:
			System.out.println("�ѷ�����!");
			break;
		case 0 :
			System.out.println("�ý��� ����");
			break;			
		default: // if�� ������ else ���� ����.
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
		
		
		
		
		
		
		
		
		
		
	}
}
