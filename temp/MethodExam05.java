
public class MethodExam05 {

	public static void main(String[] args) {
		
		for (int i = 0; i < sum().length; i++) {
			if (i == 0) {
				System.out.println("È¦¼ö ÇÕ : " + sum()[i]);
			}
			
			if (i == 1) {
				System.out.println("Â¦¼ö ÇÕ : "+ sum()[i]);
			}
		}

		
	}

	public static int[] sum() {
		int sumHol = 0;
		int sumJJak = 0;
		int[] arr = new int[2];
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sumJJak += i;
			}
			else {
				sumHol += i;
			}
		}
		
		arr[0] = sumHol;
		arr[1] = sumJJak;
		
		return arr;
		
	}
}
