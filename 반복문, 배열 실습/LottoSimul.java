import java.util.Random;

public class LottoSimul {

	public static void main(String[] args) {
		int num[] = new int[6];
		
		for (int i = 0; i < num.length; i++) {	
			
			num[i] = (int)(Math.random()*6)+1;
			
			for (int j = 0; j < i; j++) {
				if(num[j] == num[i]) {
					System.out.println("중복 발견");
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
