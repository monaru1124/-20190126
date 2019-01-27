package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		사용자의 나이와 키를 입력받자.
		

		
		int userAge ;
		double userHeight ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		userAge = scan.nextInt() ;
		
		System.out.print("키를 입력하세요 : ");
		userHeight = scan.nextDouble() ;
		
//		키가 175 이상이고, 나이가 35 이하면 (키, 나이 OK) 단어를 출력
		
		if ( userHeight >= 175 && userAge <= 35 ) {
			
			System.out.println("키, 나이 OK");
		}

//		위의 질문이 틀렸다면, 혹시 다음 조건은 만족하는지?
		
		
		else if (userHeight >= 180 ) {
			
			System.out.println("둘다 만족 X, 키가 180 이상이라 OK");
		}
		
//		위 질문도 틀렸다면, 나이가 30 이하인지?
		
		else if ( userAge <= 30 ) {
			
			System.out.println("둘다 만족 X, 키도 180 X, 나이 30 이하 OK");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
