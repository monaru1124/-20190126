package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		
//		���� : (0��C �� 1.8) + 32 = 32��F
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �µ� �Է� : ");
		double temp = scan.nextDouble();
		
		double trans  = ( temp * 1.8 ) + 32 ;				
		System.out.println(String.format("���� �µ� :  %.2f \nȭ�� �µ� :  %.2f", trans ));
	}
}
