package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		
//		숫자 입력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요 : ");
		
		int usertInput = scan.nextInt();
		
		
//		박수를 쳐야하는지? 친다면 몇번 치는지? 계산
		
		int count = 0 ;
		int backUp = usertInput;
		while (true) {
			if( backUp % 10 == 3 || backUp % 10 == 6 || backUp % 10 == 9) {
//				마지막자리가 3이거나, 6이거나, 9가 맞는경우.
				count++;
				
			}
			
//			한 자리를 판단했으니 마지막 자리 숫자를 제거.			
			backUp /=10;
			
			if(backUp == 0) {
//				모든 자리를 다 검토했으니 break로 탈출
				break;
			}
						
		}
				
		
//		결과를 출력
		
		if (count > 0) {
//			박수를 출력해야 하는 경우 => 짝!을 횟수만큼 반복
			for(int i = 0 ; i < count ; i++) {
				System.out.print("짝!");
			}
		}
		else {
//			박수를 안치는 경우? => 원본 숫자로 출력
			System.out.println(usertInput);
		}
			
		


		
	}
}
