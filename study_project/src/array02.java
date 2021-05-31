import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class array02 {

	public static void main(String[] args) {
		String firstName[] = {"김", "박", "이", "최", "장"};
		String middleName[] = {"바", "사", "아", "자", "차"};
		String lastName[] = {"가", "나", "다", "라", "마"};
		String fullName[] = new String[50];
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------------");
			System.out.println("파일 제어 프로그램 v1.0");
			System.out.println("------------------");
			
			System.out.println("1. 이름 생성 후 저장하기");
			System.out.println("2. 파일에서 이름 읽어오기");
			System.out.println("3. 프로그램 종료");
			System.out.println("------------------");
			
			System.out.print("메뉴 선택 : ");
			int menu = s.nextInt();
			
			switch (menu) {
				case 1:
				FileOutputStream output = null;
				try {
					output = new FileOutputStream("testJava.txt");
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				
					for (int i = 0; i < 50; i++) {
						fullName[i] = firstName[r.nextInt(4)] +
								  middleName[r.nextInt(4)] +
								  lastName[r.nextInt(4)] +
								  "\n";
						
						System.out.println((i+1) + "번 : " +fullName[i]);					
						try {
							output.write(fullName[i].getBytes());
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
					break;
				case 2:
					break;
				case 3:
					break;	
			}
		}

	}

}
