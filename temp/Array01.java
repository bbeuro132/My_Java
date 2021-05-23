
public class Array01 {

	public static void main(String[] args) {
		
		int arr[] = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			//System.out.println(arr[i]);
		}
		
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 5 == 0) {
				System.out.println(arr[j]);
			}
			
			if(j == 89) {
				System.out.println("³¡³À´Ï´Ù.\n");
				break;
			}
		}
		
		int arr2[][] = {
				{1,2}, {2,4,6}, {3,6},
				{4,8,10,12}, {10}
		};
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}

		int arrGugu[][] = new int[9][8];
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
	}

}
