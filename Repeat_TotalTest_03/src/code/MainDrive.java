package code;

import java.util.Scanner;

public class MainDrive {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Ҽ����� �ñ��� ���ڸ� �Է� : ");
		
		int userInput = scan.nextInt();
		
		boolean primeNumeResult = true ;
		int divider = 0; // �Ҽ��� �ƴҋ� ������������ ���ڸ� ����
		
//		�޾ƿ� ���ڰ� �Ҽ����� �ƴ���?
		
//		��ռӵ��� 2�� ������? => �۾����� ������ ������. => �ݺ�Ƚ���� ������ ���δ�.
//		�ݺ����� ���ǽ��� ��������.  
//		for (int i = 2 ; i < userInput / 2  ; i++)
		
		
		for (int i = 2 ; i < userInput ; i++) {
			
			
//			�Է°��� 2���� �ڱ��ڽ� �������� ������.
			if(userInput % i == 0) {
				
//				������������ ���ڸ� �߰�! => �Ҽ��� �ƴϰ� �Ǵ� ���ڸ� ã��!
				
				primeNumeResult = false;
				divider = i;
				break;
			}
			
			
		}
		
		
		
		
		
		
//		* ��Ǯ��
//		for(int i = userInput-1 ; i > 1 ; i--) {
//			if ( userInput % i == 0) {
//				divider = i ;
//				primeNumeResult = false;
//				break;
//			}
//			else  {
//				primeNumeResult = true;
//			}
//		}

		
		
//		�Ǵ� ����� ��� => ��Ȳ�� ���� �ٸ� ����� ��� (�Ҽ��� ������, �ƴҶ�)
		
		if (primeNumeResult ) {
			System.out.println("�Ҽ��� �½��ϴ�.");
			
		}
		else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
			System.out.println(String.format("%d�� �����������ϴ�.", divider));	
		}
		
		
		
		
		
		
		
		
	}
}
