package code;

public class MainDrive {

	public static void main(String[] args) {
		
		int number = 10 ; 
		
		number++; // number�� ���� 11�� "����"
		System.out.println(number); // 11
		
		++number ;  // number�� ���� 12�� "����"
		System.out.println(number); // 12
		
		number--; // number�� ���� 11�� "����"
		System.out.println(number); // 11
		
		--number; // number�� ���� 10�� "����"
		System.out.println(number); // 10
		
		
//		++, --�� ��ġ�� ���� �ٸ� �ൿ ����.
		
		int number2 = 20 ;
		System.out.println(number2++); // ��°� : 20, ���� 21�� ����.
		System.out.println(++number2); // ���� ���� 22�� ����, ��°� : 22.
		
		System.out.println(number2);
		
		
		
		int a = 20;

		System.out.println(++a); // ? �� : 21, ��� : 21 => 21
		System.out.println(--a); // ? �� : 20, ��� => 20
		System.out.println(--a); // ? �� : 19, ��� => 19
		System.out.println(a++); // ? ��� : 19 , �� : 20 => 19
		System.out.println(a--); // ? ��� : 20, �� : 19 = > 20
		
		
		
		
		
	}
}
