package code;

public class MainDrive {
	public static void main(String[] args) {
		
		int num1 = 7 ;
		int num2 = 20 ; 
		
		int result=0 ; // ã�Ƴ� �ּ� ������� ����.
		
//		�ּҰ������ ã�� �ڵ� �ۼ�
		
//		1. while�� ���ѹݺ��� �̿�

		int i = 1 ;
		while (true) {
			
			
			if (i % num1 == 0 & i % num2 == 0) {
	
					result = i ;
					break ;
			}
			i++;
		}
		
//		ã�Ƴ��� ���� ȭ�鿡 ���
		
		System.out.println(String.format("�ּҰ������ %d �Դϴ�", result));
		
		
//		while�� ��ü�� ������ �������.
		
		int i2 = 1;
		
		
		while (!(i2 % num1 == 0  && i2 % num2 == 0 )) {
			
			i2++;
			
			
		}
		
		System.out.println("�ι�° ��� : " + i2);
		
		
//		3. �� ���� ���� ������ ��� => 1���� ���̸鼭 �ݺ�.
		
		int result3 = 0;
		
		for (int j = num1 * num2 ; j > 0 ; j--) {
			if (j % num1 == 0 && j % num2 == 0) {
//				������ ã�� ��������� �� �������� �߰��� ��Ȳ.
				result3 = j;				
				
			}
			
			
		}
		
		System.out.println("����° ��� : " + result3);
		
		
//		4. ù��° ���ڿ� j�� ���ϰ� �װ� �ι�° ���ڷ� ����������?
		int result4 = 0;
		int i3 = 1;
		
		while(true) {
			if((num1 * i3) % num2 == 0) {
				result4 = num1*i3;
				break;
			}
			i3++;
		}
		System.out.println("�׹�° ��� : " + result4);
		
		
		
		

		
		
	}

}
