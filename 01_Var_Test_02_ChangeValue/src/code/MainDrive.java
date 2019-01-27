package code;

public class MainDrive {

	public static void main(String[] args) {
		
		
		int num1, num2, backup ;
		num1 = 10 ;
		num2 = 20 ; 
		
//		num1의 값이 사라지는건 막을수가 없음. => 미리 다른곳에 따로 저장.
		
		
		backup = num1 ;
		num1 = num2 ; // num2 값을 복사해서 num1에 대입. => num1의 값이 20으로 변경. 
		num2 = backup ; // num2에 미리 백업해둔 num1의 값(backup변수에 저장)을 복사, 대입.
		
		
		
		System.out.println(num1);
		System.out.println(num2);
	}
}
