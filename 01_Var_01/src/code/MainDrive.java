package code;

public class MainDrive {

	public static void main(String[] args) {
		
//		����, Ű, �̸��� �����ϰ� ȭ�鿡 ���.
		
//		1) �����͸� ������ ����(����)�� ����.
		int age ; // ���̸� ������ ������ ����
		double height ; // Ű�� ������ �Ǽ��� ����
		String name ; // �̸��� ������ ������ ����
		
		int birthYear ; // ������ ������ ������ ����
		
		double weight = 67.3 ; // ������ ����� �����͸� �ٷ� ���Խ�Ű�� �͵� ����
		
//		2) ������� ������ ���� �����͸� �������.
//		2.1) age�� ���̸� ����
		age = 30 ;
//		2.2) Ű�� height�� ����
		height = 170.3 ;
//		2.3) �̸��� name�� ����
		name = "����ȣ" ;
		
		birthYear = 1990 ;
		
//		birthYear = 199.5 ; => �Ұ���! �������� �Ǽ��� ������ �� ����.
		weight = 67; // ����! �Ǽ��� ������ �����ϱ� ������ ���� ����. 
		
		weight = 60.5 ; // weight�� ���� ������ �ٲٴ� ����. ���� �������� ���Ե� 60.5�� ���� Ȯ��
		
		
		
//		3) ������ �Ϸ�� �������� ���� ȭ�鿡 ���
		System.out.println(age);
		System.out.println(height);
		System.out.println(name);
		System.out.println(birthYear);
		System.out.println(weight);
		
		
	}
}
