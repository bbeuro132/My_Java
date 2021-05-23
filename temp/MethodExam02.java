import java.util.Random;

public class MethodExam02 {

	public static void main(String[] args) {
		
		System.out.println("-------------------");
		System.out.println("È¦Â¦ Ã£±â ÇÁ·Î±×·¥ v1.0");
		System.out.println("-------------------");
		
		int[] arr = new int[10];
		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + 1;
		}
		
		check(arr);
		
	}

	
	public static void check(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("arr["+i+"] : " + arr[i] + ", Â¦¼ö");
			}
			else {
				System.out.println("arr["+i+"] : " + arr[i] + ", È¦¼ö");
			}
		}

	}
}
