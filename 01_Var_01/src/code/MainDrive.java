package code;

public class MainDrive {

	public static void main(String[] args) {
		
//		나이, 키, 이름을 저장하고 화면에 출력.
		
//		1) 데이터를 저장할 공간(변수)을 생성.
		int age ; // 나이를 저장할 정수형 변수
		double height ; // 키를 저장할 실수형 변수
		String name ; // 이름을 저장할 문자형 변수
		
		int birthYear ; // 생년을 저장할 정수형 변수
		
		double weight = 67.3 ; // 변수를 만들고 데이터를 바로 대입시키는 것도 가능
		
//		2) 만들어진 변수에 실제 데이터를 집어넣음.
//		2.1) age에 나이를 대입
		age = 30 ;
//		2.2) 키를 height에 대입
		height = 170.3 ;
//		2.3) 이름을 name에 대입
		name = "정대호" ;
		
		birthYear = 1990 ;
		
//		birthYear = 199.5 ; => 불가능! 정수에는 실수를 대입할 수 없다.
		weight = 67; // 가능! 실수는 정수를 포함하기 때문에 대입 가능. 
		
		weight = 60.5 ; // weight의 값을 여러번 바꾸는 예시. 가장 마지막에 대입된 60.5만 보존 확인
		
		
		
//		3) 대입이 완료된 변수들의 값을 화면에 출력
		System.out.println(age);
		System.out.println(height);
		System.out.println(name);
		System.out.println(birthYear);
		System.out.println(weight);
		
		
	}
}
