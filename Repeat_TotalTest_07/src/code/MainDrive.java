package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		
//		���� �Է�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ��� : ");
		
		int usertInput = scan.nextInt();
		
		
//		�ڼ��� �ľ��ϴ���? ģ�ٸ� ��� ġ����? ���
		
		int count = 0 ;
		int backUp = usertInput;
		while (true) {
			if( backUp % 10 == 3 || backUp % 10 == 6 || backUp % 10 == 9) {
//				�������ڸ��� 3�̰ų�, 6�̰ų�, 9�� �´°��.
				count++;
				
			}
			
//			�� �ڸ��� �Ǵ������� ������ �ڸ� ���ڸ� ����.			
			backUp /=10;
			
			if(backUp == 0) {
//				��� �ڸ��� �� ���������� break�� Ż��
				break;
			}
						
		}
				
		
//		����� ���
		
		if (count > 0) {
//			�ڼ��� ����ؾ� �ϴ� ��� => ¦!�� Ƚ����ŭ �ݺ�
			for(int i = 0 ; i < count ; i++) {
				System.out.print("¦!");
			}
		}
		else {
//			�ڼ��� ��ġ�� ���? => ���� ���ڷ� ���
			System.out.println(usertInput);
		}
			
		


		
	}
}
