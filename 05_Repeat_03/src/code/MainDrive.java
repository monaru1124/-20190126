package code;

public class MainDrive {

	public static void main(String[] args) {
		
//		1) for문의 기본 구조 예시
		
//		i : 0 ~ 9 까지 10번 반복.
//		for (int i = 0 ; i < 10 ; i++ ) {
//			System.out.println("10번 반복!");
//			
//		}
		
		
//		2) for문을 도는데 활용되는 변수 i(index)의 활용 가능성
		
//		i : 0 ~ 4까지 총 5회 반복.
//		for문에서 만든 변수는 해당 for문의 중괄호 안에서 다양하게 활용 가능.
//		이 i를 활용하는 연습문제들을 많이 풀어보자. 
		
//		for (int i = 0 ; i < 5 ; i++) {
//			System.out.println(i+1);
//			
//		}
		
//		for문 중괄호를 벗어난 영역에서는 for문에서 만든 변수를 사용할 수 없다.
//		System.out.println(i);
	
		
//		3) i를 증가시키는 for문 뿐 아니라, i를 감소시키는 방향으로도 작성할 수 있다.
		
//		 - 초기화 조건인 int i=5 처럼 큰 값에서 출발.
//		 - 조건식은 i가 특정 값보다 큰지? Ex. i > 0
//		 - 반복수행독작은 --를 이용한다.
		
		for (int i = 5 ; i > 0 ; i-- ) {
			System.out.println(i);
		}
		
		
		
	}
}
