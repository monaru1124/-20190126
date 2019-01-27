package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("±Ã±İÇÑ ³âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		int inputYear = scan.nextInt();
		
		if ( inputYear % 4 == 0 ) {
			
			if ( inputYear % 100 == 0) {
				
				if ( inputYear % 400 == 0) {
					System.out.println("À±³â O, 4·Î ³ª´²¶³¾îÁö°í, 100À¸·Î ³ª´²¶³¾îÁö³ª, 400À¸·Î ³ª´² ¶³¾îÁü.");
					
				}
				else {
					System.out.println("À±³â X, 4·Î ³ª´²¶³¾îÁö³ª 100À¸·Î ³ª´²¶³¾îÁö°í 400À¸·Î´Â ¾È³ª´²¶³¾îÁü");
				}
			}
			else {
				System.out.println("À±³â O, 4·Î ³ª´²¶³¾îÁö°í, 100À¸·Î ¾È³ª´²¶³¾îÁü");
			}
		}
		else {
			System.out.println("À±³â X, 4·Î ¾È³ª´²¶³¾îÁü.");
			
		}
	}
}
