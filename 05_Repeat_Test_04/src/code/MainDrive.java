package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		���� �ջ��� ������ ����.
		int sum1 = 0 ;
		
				
		for (int i =0 ; i<100 ; i++) {
//			i : 0 / 1 ����, i : 99 / 100 ����
//			�ڱ��ڽ��� ������Ű�� �������� +=�� Ȱ�� (���Կ����� ����)
			sum1 += (i+1) ;
			
		}
		System.out.println(String.format("1~100�� �� : %d",sum1));
		
		
		
		
		
		
//		2�� ���� ��� ���� ����
		int sum2 = 0 ;
		
		for (int i = 0 ; i < 100 ; i++ ) {
//			���Ϸ��� ���ڰ� ¦����?
			if ((i+1) % 2 == 0) {
				sum2 += (i+1);
			}
//			¦���� �ƴ϶��? �ƹ� �͵� ���ϴϱ�, �ۼ��� �ʿ䵵 ����.
		
		}
		
		System.out.println(String.format("1~100�� ¦�� �� : %d",sum2));
			
		
		
//		3�� ���� ��� ������ ����
		int sum3 =0; 
		
//		�Է°� �ޱ� ���� �۾�
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int userInput = scan.nextInt();
		
		
		for (int i = 0 ; i < userInput ; i++) {
			if ((i+1) % 2 != 0 ) {
				sum3 += (i+1);
			}
		}
		System.out.println(String.format("1~%d �� Ȧ���� �� : %d",userInput,sum3));
	}
}
