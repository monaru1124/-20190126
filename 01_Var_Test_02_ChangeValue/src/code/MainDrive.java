package code;

public class MainDrive {

	public static void main(String[] args) {
		
		
		int num1, num2, backup ;
		num1 = 10 ;
		num2 = 20 ; 
		
//		num1�� ���� ������°� �������� ����. => �̸� �ٸ����� ���� ����.
		
		
		backup = num1 ;
		num1 = num2 ; // num2 ���� �����ؼ� num1�� ����. => num1�� ���� 20���� ����. 
		num2 = backup ; // num2�� �̸� ����ص� num1�� ��(backup������ ����)�� ����, ����.
		
		
		
		System.out.println(num1);
		System.out.println(num2);
	}
}
