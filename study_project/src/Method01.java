
public class Method01 {

	public static void main(String[] args) {
		//void �����ϸ� ���� �� ����
		//1. void method1() : �Ű����� X
		//2. void method2(�Ű�����, ...) : �Ű����� O, �������� ���� ����
		
		//3. Ÿ�� method3() : �ݵ�� Ÿ�԰� ��ġ�ϴ� return ���� �����ؾ���
		//4. Ÿ�� method4(�Ű�����, ...) : return �ʿ�, �Ű����� O
		
		//5. ����Լ�
		
		method1();
		//��޼ҵ� ȣ��
	}
	
	//�޼ҵ��� ���ǡ�
	public static void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("method1 ȣ��");
		}
	}
	
	public static void showName() {
		String name = "ȫ�浿";
		System.out.println(name);
	}
	
	//�޼ҵ� �����ε�(�ߺ� ����)
	//1. �Ű����� Ÿ���� �ٸ�,
	//2. �Ű����� ������ �ٸ�
	public static void showName(String name) {
		System.out.println(name);
	}
	
	public static void showName(String name, int age) {
		
	}

}
