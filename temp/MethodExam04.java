import java.util.Random;

public class MethodExam04 {

	public static void main(String[] args) {
		
		for (int i : lotto()) {
			System.out.println(i);
		}

	}
	
	public static int[] lotto() {
		Random r = new Random();
		
		int[] Lotto = new int[6];
		
		for (int i = 0; i < Lotto.length; i++) {
			Lotto[i] = r.nextInt(45)+1; //번호 저장
			
			for (int j = 0; j < i; j++) {
				if (Lotto[i] == Lotto[j]) {				
					i--;
					break;
				}
			}
		}
		
		return Lotto;
		
		
	}

}
