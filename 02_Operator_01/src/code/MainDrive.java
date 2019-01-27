package code;

public class MainDrive {

	public static void main(String[] args) {
		
//		연산에 활용될 두개의 숫자를 생성.
		int num1 = 5 ; 
		int num2 = 10 ;
		
//		사칙연산의 결과를 화면에 바로 출력
		
//		System.out.println(num1 + num2); // 15
//		System.out.println(num1 - num2); // -5
//		System.out.println(num1 * num2); // 50
//		System.out.println(num1 / num2); // 0
//		System.out.println(num1 % num2); // 5
		
		
		int num3 = 11 ;
		int num4 = 7 ; 
		
		System.out.println(num3 + num4);  // 18
		System.out.println(num3 - num4);  // 4
		System.out.println(num3 * num4);  // 77
		System.out.println(num3 / num4);  // 1
		System.out.println(num3 % num4);  // 4
		
		
		int result = 5 + 8 * 10 - 6 / 3 ; // 83
		int result2 = (5 + 8) * 10 - 6 / 3 ; // 128 
		System.out.println(result);
		System.out.println(result2);
		
		
		
	}
}
