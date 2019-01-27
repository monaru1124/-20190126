package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		잔액을 저장할 변수를 만들고, 연 이율 7% 적금이라고 가정.
//		1000을 넣었을때, 몇년이 지나면 두배가 되는가?
//		1000 => 1070  => 1070*1.07 ... => 두배가 넘는 시점? 몇년만에?
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액 입력 : ");		
		int userMoney =scan.nextInt();
		
//		정수에 1.07을 곱하면 => 결과는 실수 => 강제로 정수 변환.
		
		
		
		
		int count = 0 ;
		int amount = userMoney ; 
		while (true) {
			count++;
			
			amount = (int) (amount * 1.07) ;
			
			if (amount >= userMoney *2) {
				System.out.println(String.format("%d년 만에 두배가 넘었습니다.", count));
				System.out.println(String.format("%d년째 되는 해의 잔고 : %s", count, amount));
				break;
			}
			
			
		}
		
	}
}
