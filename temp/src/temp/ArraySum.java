package temp;

public class ArraySum {
	private int[] arr;
	private int sum;
	private int avg;
	
	public ArraySum(int[] arr) {
		this.arr = arr;
	}
	
	public void ShowSum() {
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
	
	public void ShowAvg() {
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		
		System.out.println(avg);
	}
	
	public void ShowAll() {
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / arr.length;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
	
}
