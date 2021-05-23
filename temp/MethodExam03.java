import java.util.Scanner;

public class MethodExam03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("-------------------");
		System.out.println("������ ��� ���α׷� v1.0");
		System.out.println("-------------------");
		
		for (;;) {
			
			System.out.print("�������� �Է� : ");
			int lang = s.nextInt();
			System.out.print("�������� �Է� : ");
			int eng = s.nextInt();
			System.out.print("�������� �Է� : ");
			int math = s.nextInt();
			
			if (lang < 0 || eng < 0 || math < 0) {
				System.out.println("0 �̸��� ������ �Է��� �� �����ϴ�.\n");
				
				if (lang < 0) {
					System.out.println("���� ������ 0 �̸��Դϴ�.");
				}
				if (eng < 0) {
					System.out.println("���� ������ 0 �̸��Դϴ�.");
				}
				if (math < 0) {
					System.out.println("���� ������ 0 �̸��Դϴ�.");
				}
				System.out.println("");
				continue;
			}
			else {
				avg(lang, eng, math);
				break;
			}
		}
		
		s.close();
		
	}
	
	public static void avg(int lang, int eng, int math) {
		int sum = lang+eng+math;
		int avg = sum / 3;
		System.out.println("");
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}

}
