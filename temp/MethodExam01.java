import java.util.Scanner;

public class MethodExam01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-------------------");
		System.out.println("������ ���� ���α׷� v1.0");
		System.out.println("-------------------");
		
		System.out.print("���� 1 �Է� : ");
		int num1 = s.nextInt();
		System.out.print("���� 2 �Է� : ");
		int num2 = s.nextInt();
		System.out.print("���� 3 �Է� : ");
		int num3 = s.nextInt();
		
		Sort(num1, num2, num3);
		
		s.close();
	}

	
	public static void Sort(int num1, int num2, int num3) {
		
		int temp = 0;
		
		if (num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if (num1 < num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		
		
		if (num2 < num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
				
		System.out.println(num1 + " " + num2 + " " + num3);
	}
}
