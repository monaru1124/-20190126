package code;

public class MainDrive {

	public static void main(String[] args) {
		
		
//		1,2,4,5,6,7,8,9,10을 출력.
		
		for ( int i = 0 ; i < 10 ; i++ ) {
			if(i + 1 == 3) {
//				출력될 값이 3인 경우 skip 해달라는 의미로 continue;를 작성.
				continue ;		
			}
			System.out.println(i+1);
			
		}
		
		
	}
}
