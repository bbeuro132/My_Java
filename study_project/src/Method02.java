
public class Method02 {

	public static void main(String[] args) {
		System.out.println("���� : "+getAge());
		System.out.println("�̸� : "+getName());
		System.out.println("���� : "+getAge(100));
		System.out.println("�̸� : "+getName("��"));
	}
	
	public static int getAge() {
		int age = 100;
		return age;
	}
	
	public static String getName() {
		String name = "ȫ�浿";
		return name;
	}
	
	public static int getAge(int age) {
		return age + 100;
	}
	
	public static String getName(String lastName) {
		return lastName + "�浿";
	}

}
