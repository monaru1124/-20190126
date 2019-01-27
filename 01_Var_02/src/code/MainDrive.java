package code;

public class MainDrive {

	public static void main(String[] args) {
		
//		두개의 정수형 변수 num1, num2를 만들고 각각 10, 20을 대입하자.
		int num1 ;
		int num2 ; 
		num1 = 10 ;
		num2 = 20 ;
		
//		num1에 num2를 대입.
		num1 = num2 ; 
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		int num3 = 30 ;
		
		num1 = num2 = num3 ;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		final double PI = 3.14 ; // 원주율 계산에 사용하고자 함.
		
//		PI = 7.14 ;  final 붙을 시 에러 발생 
		
		
	}
}
