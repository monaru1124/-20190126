package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("ù��° ���� : ");
		int num1 = scan.nextInt();
		
		System.out.println("�ι�° ���� : ");
		int num2 = scan.nextInt();
		
//		ù���� ���
		int sum = num1 + num2 ;		
		System.out.println("�� ���� �� : "+ sum );
		
		int sub;
		if (num1 >= num2) {
			sub = num1 - num2 ;
			
		}
		else {
			sub = num2 - num1 ;
		}
		
		System.out.println("�� ���� �� : "+sub);
		
//		�ι�° ���
//		���� �� ���� �ϴ� ���ϰ�, �װ� 0���� ������ -1�� �����ִ� ���
		
		sub = num1-num2;
		if (sub < 0 ) {
			sub *= -1 ;			
		}
		System.out.println("�� ���� �� (�ι�° ���) : " + sub);
		
		
//		����° ���
//		�� ū ���� num1�� ��ġ�ϵ��� �ٲ�ġ��.
		
		if (num2 > num1) {
			int backUp = num1;
			num1 = num2 ;
			num2 = backUp ;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
