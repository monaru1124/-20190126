package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		1) 키보드 입력을 받는 기능을 가진 Scanner 클래스 변수 scan을 만들고, 내용물을 채워넣음.
		Scanner scan = new Scanner(System.in) ;
		
//		2) 숫자 입력 안내문 출력.
		System.out.print("숫자를 입력해주세요 : ");
		
		
//		3) 위에서 만든 scan 변수의 기능을 활용해 정수를 입력받고
//		   입력받은 정수를 userInputNum에 대입.
		int userInputNum = scan.nextInt();
		
//		4) 입력받은 숫자를 출력.
		System.out.println("사용자가 입력한 숫자 : " + userInputNum);
		
//		키를 실수 형태로 입력받아서 출력
		System.out.print("키를 입력해주세요 : ");
		
		double userHeight = scan.nextDouble() ;
		
//		이름을 받아서 저장
		System.out.print("이름을 입력해주세요 : ");
		
		String userName = scan.nextLine() ;
		
//		???의 키는 ??? 입니다. 문장 출력
		
		System.out.println(userName+"의 키는" + userHeight + "입니다");
		
		
		
		
	}
}
