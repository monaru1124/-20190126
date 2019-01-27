package code;

public class MainDrive {

	public static void main(String[] args) {
		
		int age = 32 ; 
		double height = 180.7 ; 
		
//		Q1. 키가 180 이상이고, 동시에 나이가 30 미만인가?
		boolean result1 = height > 180 && age < 30 ; // false
		
//		Q2. 키가 180 이상이거나, 나이가 30 미만이거나, 둘 중 하나라도 해라.
		boolean result2 = height > 180 || age < 30 ; // ture 
		
		
		System.out.println(result1);
		System.out.println(result2);
		
//		Q3. Q1을 만족하는 사람 빼고 전부.
		boolean result3 = !(height > 180 && age < 30 ) ; // true
		System.out.println(result3); 
		
//		Q4. Q2의 조건을 만족하는 사람 빼고 전부.
		boolean result4 = !result2 ;
		
		
		
	}
}
