package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		1) Ű���� �Է��� �޴� ����� ���� Scanner Ŭ���� ���� scan�� �����, ���빰�� ä������.
		Scanner scan = new Scanner(System.in) ;
		
//		2) ���� �Է� �ȳ��� ���.
		System.out.print("���ڸ� �Է����ּ��� : ");
		
		
//		3) ������ ���� scan ������ ����� Ȱ���� ������ �Է¹ް�
//		   �Է¹��� ������ userInputNum�� ����.
		int userInputNum = scan.nextInt();
		
//		4) �Է¹��� ���ڸ� ���.
		System.out.println("����ڰ� �Է��� ���� : " + userInputNum);
		
//		Ű�� �Ǽ� ���·� �Է¹޾Ƽ� ���
		System.out.print("Ű�� �Է����ּ��� : ");
		
		double userHeight = scan.nextDouble() ;
		
//		�̸��� �޾Ƽ� ����
		System.out.print("�̸��� �Է����ּ��� : ");
		
		String userName = scan.nextLine() ;
		
//		???�� Ű�� ??? �Դϴ�. ���� ���
		
		System.out.println(userName+"�� Ű��" + userHeight + "�Դϴ�");
		
		
		
		
	}
}
