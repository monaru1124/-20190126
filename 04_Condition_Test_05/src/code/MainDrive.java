package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� ���Ծ� : ");
		int yearIncome = scan.nextInt() ;
		
		int realYearIncome;
		
		if (yearIncome <=1000) {
//			���� * �Ǽ� => �⺻������ �Ǽ��� ��Ÿ��.
//			�׳� �ڵ��ϰ� �Ǹ� �Ǽ��� �������� ������ �������� �ϴ�, ���� �߻�
//			����� ���� �Ǽ��� ������ ������ ��ȯ. (����ȯ, Casting)
			
			realYearIncome = (int) (yearIncome * 0.92 ) ;
			
		}
		else if (yearIncome <= 4000 ) {
			realYearIncome = (int) (yearIncome * 0.83 ) ;
		}
		else if (yearIncome <= 8000 ) {
			realYearIncome = (int) (yearIncome * 0.74 ) ;
		}
		else {
			realYearIncome = (int) (yearIncome * 0.65 ) ;
		}
		System.out.println("�� ���ɾ� : " + realYearIncome);
		
	}
}
