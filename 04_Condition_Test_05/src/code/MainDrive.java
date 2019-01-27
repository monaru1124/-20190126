package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("연 수입액 : ");
		int yearIncome = scan.nextInt() ;
		
		int realYearIncome;
		
		if (yearIncome <=1000) {
//			정수 * 실수 => 기본적으로 실수로 나타남.
//			그냥 코딩하게 되면 실수를 정수형태 변수에 담으려고 하니, 에러 발생
//			결과로 나온 실수를 강제로 정수로 변환. (형변환, Casting)
			
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
		System.out.println("실 수령액 : " + realYearIncome);
		
	}
}
