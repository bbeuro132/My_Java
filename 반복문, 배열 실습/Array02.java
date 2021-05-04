import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		//입력받는 값의 범위 1 ~ 65535
		//int 배열크기 16으로 사용하여 각각의 공간에 이진수 0, 1 저장
		//10진수를 2진수로 변경하여 2번 배열에 저장하여 출력
		//ex) 8을 입력하면 00001000출력
		//255를 입력하면 11111111 출력
		//256을 입력하면 00000001 00000000 출력
		
		int bin[] = new int[16];
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력(1 ~ 65535) : ");
		int num = sc.nextInt();
		int temp = num;
		int div = 0;
		int other = 0;
		
		do {
			div = num / 2;
			other = num - div*2;
			
			bin[i] = other;
			num = div;
			i+=1;
			
		} while (div != 0);
			
		if (temp >= 256) {
			for (int j = bin.length-1; j >= 0; j--) {
				System.out.print(bin[j]);
			}
		}
		else if (temp <= 255) {
			for (int j = bin.length-9; j >= 0; j--) {
				System.out.print(bin[j]);
			}
		}
		
		sc.close();
	}

}
