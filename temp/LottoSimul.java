import java.util.Random;

public class LottoSimul {

	public static void main(String[] args) {
		int num[] = new int[6];
		Random r = new Random();
		
		System.out.println("-------------------");
		System.out.println("간단한 로또 프로그램 v1.0");
		System.out.println("-------------------");
		
		for (int i = 0; i < num.length; i++) {		
			num[i] = r.nextInt(6)+1;		
			for (int j = 0; j < i; j++) {
				if(num[j] == num[i]) {
					i--;
					break;
				}
			}		
		}	
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}


	}	
}
