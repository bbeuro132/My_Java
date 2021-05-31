import java.util.Scanner;

public class FactoExam {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("num : ");
		int num = s.nextInt();
		
		System.out.println(facto(num));
	}
	
	public static int facto(int num) {
		if (num > 1) {
			return num * facto(num-1);
		}
		return num;		
		
	}

}
