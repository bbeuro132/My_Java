
public class MethodExam06 {

	public static void main(String[] args) {
		
		gugu();

	}
	
	public static void gugu() {
		for (int i = 1; i < 10; i++) {

			for (int j = 2; j < 10; j++) {
				if (j % 2 == 0) {
					continue;
				}
				else {
					System.out.printf("%d x %d = %d\t", j, i, j*i);
				}
			}
			System.out.println();

		}
	}

}
