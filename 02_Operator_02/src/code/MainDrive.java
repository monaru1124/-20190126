package code;

public class MainDrive {

	public static void main(String[] args) {
		
		int num1 = 20 ;
		int num2 = 20 ;
		
		System.out.println(num1 > num2); // false
		System.out.println(num1 >= num2); // true
		
		num1 = 10 ;
				
		System.out.println(num1 < num2); // true
		System.out.println(num1 <= num2); // true
		
		System.out.println(num1 == num2); // false
		System.out.println(num1 != num2); // true
		
//		int, double, String �̿��� Ÿ�� : boolean
		
		boolean result1 = num1 > num2 ;  // �� ������ ����� �����ϴ� ����.
		
		System.out.println(result1); // false
		
	}
}
