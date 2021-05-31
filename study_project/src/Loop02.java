import java.util.Scanner;

public class Loop02 {
	
	public static final int MENU_FILE_WRITE = 1;
	public static final int MENU_FILE_READ = 2;
	public static final int MENU_FILE_OUT = 3;

	public static void main(String[] args) {
		System.out.println("------------------");
		System.out.println("���� ���� ���α׷� v1.0");
		System.out.println("------------------");
		
		Scanner s = new Scanner(System.in);

		int select = 0;
		
		for (; ;) {
			System.out.println("1. ���� ���� �� ����");
			System.out.println("2. ���� �б�");
			System.out.println("3. ����");
			System.out.println("------------------");
			
			System.out.printf("�޴��� �����ϼ��� : ");
			select = s.nextInt();
			
			switch (select) {
			
			case MENU_FILE_WRITE:
				System.out.println("\n���� ����\n");
				break;
			case MENU_FILE_READ:
				System.out.println("\n���� �б�\n");
				break;
			case MENU_FILE_OUT:	
				System.out.println("\n\n�����մϴ�.");
				break;
			}
			
			if (select == 3) {
				s.close();
				break;
			}
			
		}
		
	}

}
