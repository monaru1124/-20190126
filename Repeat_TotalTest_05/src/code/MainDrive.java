package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		�ܾ��� ������ ������ �����, �� ���� 7% �����̶�� ����.
//		1000�� �־�����, ����� ������ �ι谡 �Ǵ°�?
//		1000 => 1070  => 1070*1.07 ... => �ι谡 �Ѵ� ����? ��⸸��?
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ� �Է� : ");		
		int userMoney =scan.nextInt();
		
//		������ 1.07�� ���ϸ� => ����� �Ǽ� => ������ ���� ��ȯ.
		
		
		
		
		int count = 0 ;
		int amount = userMoney ; 
		while (true) {
			count++;
			
			amount = (int) (amount * 1.07) ;
			
			if (amount >= userMoney *2) {
				System.out.println(String.format("%d�� ���� �ι谡 �Ѿ����ϴ�.", count));
				System.out.println(String.format("%d��° �Ǵ� ���� �ܰ� : %s", count, amount));
				break;
			}
			
			
		}
		
	}
}
