package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		
//		°è»ê½Ä : (0¡ÆC ¡¿ 1.8) + 32 = 32¡ÆF
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("¼·¾¾ ¿Âµµ ÀÔ·Â : ");
		double temp = scan.nextDouble();
		
		double trans  = ( temp * 1.8 ) + 32 ;				
		System.out.println(String.format("¼·¾¾ ¿Âµµ :  %.2f \nÈ­¾¾ ¿Âµµ :  %.2f", trans ));
	}
}
