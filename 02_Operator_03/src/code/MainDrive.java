package code;

public class MainDrive {

	public static void main(String[] args) {
		
		int age = 32 ; 
		double height = 180.7 ; 
		
//		Q1. Ű�� 180 �̻��̰�, ���ÿ� ���̰� 30 �̸��ΰ�?
		boolean result1 = height > 180 && age < 30 ; // false
		
//		Q2. Ű�� 180 �̻��̰ų�, ���̰� 30 �̸��̰ų�, �� �� �ϳ��� �ض�.
		boolean result2 = height > 180 || age < 30 ; // ture 
		
		
		System.out.println(result1);
		System.out.println(result2);
		
//		Q3. Q1�� �����ϴ� ��� ���� ����.
		boolean result3 = !(height > 180 && age < 30 ) ; // true
		System.out.println(result3); 
		
//		Q4. Q2�� ������ �����ϴ� ��� ���� ����.
		boolean result4 = !result2 ;
		
		
		
	}
}
