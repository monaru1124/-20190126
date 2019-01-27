package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		int a = (int)(5500 - (1000*0.08 + 3000*0.17 + 1500*0.26));
		System.out.println(a);
		
		Scanner scan = new Scanner(System.in);
				
		System.out.print("연 수익 :");
		int income = scan.nextInt() ;
		
		int netIncome ;
		
		int t35, t26, t17, t8 ;
		t35 = t26 = t17 = t8 = 0 ; 
		
		if (income > 8000 ) {
			t35 = income - 8000 ;
			t26 = income - t35 - 4000 ;
			t17 = income - t35 - t26 - 1000 ;
			t8 = 1000;			
		}
		else if ( income > 4000) {
			t26 = income - t35 - 4000 ;
			t17 = income - t35 - t26 - 1000 ;
			t8 = 1000;
		}
		else if (income > 1000 ) {
			t17 = income - t35 - t26 - 1000 ;
			t8 = 1000;
		}
		else {			
			t8 = income ;			
		}
		netIncome = (int) (income - ( t35 * 0.35 + t26 * 0.26 + t17 * 0.17 + t8 * 0.08));
		System.out.println("실제 수령액 :" + netIncome);
		

	}
}
