import java.util.Scanner;

public class Loop02 {
	
	public static final int MENU_FILE_WRITE = 1;
	public static final int MENU_FILE_READ = 2;
	public static final int MENU_FILE_OUT = 3;

	public static void main(String[] args) {
		System.out.println("------------------");
		System.out.println("파일 관리 프로그램 v1.0");
		System.out.println("------------------");
		
		Scanner s = new Scanner(System.in);

		int select = 0;
		
		for (; ;) {
			System.out.println("1. 파일 생성 및 쓰기");
			System.out.println("2. 파일 읽기");
			System.out.println("3. 종료");
			System.out.println("------------------");
			
			System.out.printf("메뉴를 선택하세요 : ");
			select = s.nextInt();
			
			switch (select) {
			
			case MENU_FILE_WRITE:
				System.out.println("\n파일 생성\n");
				break;
			case MENU_FILE_READ:
				System.out.println("\n파일 읽기\n");
				break;
			case MENU_FILE_OUT:	
				System.out.println("\n\n종료합니다.");
				break;
			}
			
			if (select == 3) {
				s.close();
				break;
			}
			
		}
		
	}

}
