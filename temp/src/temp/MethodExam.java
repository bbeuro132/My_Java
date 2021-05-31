package temp;

import java.util.Random;

public class MethodExam {

	public static void main(String[] args) {
		
		int[] sum = new int[5];
		int[] avg = new int[5];

		for (int i = 0; i < RandomScore().length; i++) {
			
			for (int j = 0; j < RandomScore()[i].length; j++) {
				sum[i] += RandomScore()[i][j];
			}
			avg[i] = sum[i] / 3;
		}
		
		for (int i = 0; i < sum.length; i++) {
			System.out.printf("총점 : %d 평균 : %d\t", sum[i], avg[i]);
			if (avg[i] <= 100 && avg[i] >= 90) {
				System.out.printf("학점 : A");
			}
			else if (avg[i] >= 80 && avg[i] <= 89) {
				System.out.printf("학점 : B");
			}
			else if (avg[i] >= 70 && avg[i] <= 79) {
				System.out.printf("학점 : C");
			}
			else if (avg[i] >= 60 && avg[i] <= 69) {
				System.out.printf("학점 : D");
			}
			else if (avg[i] >= 50 && avg[i] <= 59) {
				System.out.printf("학점 : E");
			}
			else if (avg[i] >= 0 && avg[i] <= 49) {
				System.out.printf("학점 : F");
			}
			System.out.println();
		}

	}
	
	public static int[][] RandomScore() {
		Random r = new Random();
		int[][] score = new int[5][3];
		
		for (int i = 0; i < score.length; i++) {
			
			for (int j = 0; j < score[i].length; j++) {
				
				score[i][j] = r.nextInt(100);
				
			}
		}
		
		return score;
	}

}
