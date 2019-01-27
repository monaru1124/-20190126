package code;

public class MainDrive {
	public static void main(String[] args) {
		
		int num1 = 7 ;
		int num2 = 20 ; 
		
		int result=0 ; // 찾아낸 최소 공배수를 저장.
		
//		최소공배수를 찾는 코드 작성
		
//		1. while문 무한반복을 이용

		int i = 1 ;
		while (true) {
			
			
			if (i % num1 == 0 & i % num2 == 0) {
	
					result = i ;
					break ;
			}
			i++;
		}
		
//		찾아내고 나면 화면에 출력
		
		System.out.println(String.format("최소공배수는 %d 입니다", result));
		
		
//		while문 자체에 조건을 적어넣자.
		
		int i2 = 1;
		
		
		while (!(i2 % num1 == 0  && i2 % num2 == 0 )) {
			
			i2++;
			
			
		}
		
		System.out.println("두번째 방법 : " + i2);
		
		
//		3. 두 수를 곱한 값에서 출발 => 1까지 줄이면서 반복.
		
		int result3 = 0;
		
		for (int j = num1 * num2 ; j > 0 ; j--) {
			if (j % num1 == 0 && j % num2 == 0) {
//				이전에 찾은 공배수보다 더 작은값을 발견한 상황.
				result3 = j;				
				
			}
			
			
		}
		
		System.out.println("세번째 방법 : " + result3);
		
		
//		4. 첫번째 숫자에 j를 곱하고 그게 두번째 숫자로 나눠지는지?
		int result4 = 0;
		int i3 = 1;
		
		while(true) {
			if((num1 * i3) % num2 == 0) {
				result4 = num1*i3;
				break;
			}
			i3++;
		}
		System.out.println("네번째 방법 : " + result4);
		
		
		
		

		
		
	}

}
