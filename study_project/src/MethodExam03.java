import java.util.Scanner;

public class MethodExam03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("-------------------");
		System.out.println("간단한 평균 프로그램 v1.0");
		System.out.println("-------------------");
		
		for (;;) {
			
			System.out.print("국어점수 입력 : ");
			int lang = s.nextInt();
			System.out.print("영어점수 입력 : ");
			int eng = s.nextInt();
			System.out.print("수학점수 입력 : ");
			int math = s.nextInt();
			
			if (lang < 0 || eng < 0 || math < 0) {
				System.out.println("0 미만의 점수는 입력할 수 없습니다.\n");
				
				if (lang < 0) {
					System.out.println("국어 점수가 0 미만입니다.");
				}
				if (eng < 0) {
					System.out.println("영어 점수가 0 미만입니다.");
				}
				if (math < 0) {
					System.out.println("수학 점수가 0 미만입니다.");
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
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
