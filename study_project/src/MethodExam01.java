import java.util.Scanner;

public class MethodExam01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-------------------");
		System.out.println("간단한 정렬 프로그램 v1.0");
		System.out.println("-------------------");
		
		System.out.print("숫자 1 입력 : ");
		int num1 = s.nextInt();
		System.out.print("숫자 2 입력 : ");
		int num2 = s.nextInt();
		System.out.print("숫자 3 입력 : ");
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
