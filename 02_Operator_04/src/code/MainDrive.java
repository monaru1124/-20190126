package code;

public class MainDrive {

	public static void main(String[] args) {
		
		int number = 10 ; 
		
		number++; // number의 값이 11로 "변경"
		System.out.println(number); // 11
		
		++number ;  // number의 값이 12로 "변경"
		System.out.println(number); // 12
		
		number--; // number의 값이 11로 "변경"
		System.out.println(number); // 11
		
		--number; // number의 값이 10로 "변경"
		System.out.println(number); // 10
		
		
//		++, --의 위치에 따른 다른 행동 예시.
		
		int number2 = 20 ;
		System.out.println(number2++); // 출력값 : 20, 값을 21로 변경.
		System.out.println(++number2); // 먼저 값을 22로 변경, 출력값 : 22.
		
		System.out.println(number2);
		
		
		
		int a = 20;

		System.out.println(++a); // ? 값 : 21, 출력 : 21 => 21
		System.out.println(--a); // ? 값 : 20, 출력 => 20
		System.out.println(--a); // ? 값 : 19, 출력 => 19
		System.out.println(a++); // ? 출력 : 19 , 값 : 20 => 19
		System.out.println(a--); // ? 출력 : 20, 값 : 19 = > 20
		
		
		
		
		
	}
}
