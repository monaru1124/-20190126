package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �ϳ� �Է� : ");
		
		int userInput = scan.nextInt();
		
//		������� ���� ����
		int result = 0 ;
		
//		�� �ڸ��� ���� ���
		
		int backUp = userInput ;
		
		while(true) {
			
			
//			12345 => 5�� �����ؼ� result�� ����.
//			�Է� ������ ������ �ڸ��� ����, result�� ������.
			result += backUp % 10 ;
			
//			���� ���ڴ� ���������� �ʹ�.
//			12345 => 1234 => 12345/10 => 1234 10�� ���� ������ ��ü.
			
			backUp /= 10 ;
			
//			�ݺ����� ���� Ż��?
			if(backUp == 0) {
//				������ �ڸ��� �� ������ 0�� �Ǹ� Ż��.
				break;
			}
			
			
		}
		
//		���� ����� ���
		System.out.println(String.format("%d�� �� �ڸ��� ���� %d�Դϴ�.",  userInput, result));
		
	}
}
