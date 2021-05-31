package Lee.carApp.carApp.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	
	Scanner s = new Scanner(System.in);
	public static final int MAIN_MENU_VIEW = 1;
	public static final int MAIN_MENU_RAND_INS = 2;
	public static final int MAIN_MENU_INS = 3;
	public static final int MAIN_MENU_EXIT = 4;
	
	public int mainMenu() {
		
		System.out.println("***********************");
		System.out.println("�߰��� �Ÿ� ���� ���α׷� v1.1");
		System.out.println("***********************");
		System.out.println("1. �߰��� �Ÿ� ��Ȳ ����");
		System.out.println("2. �߰��� �Ÿ� ���� �ڷ� �߰�");
		System.out.println("3. �߰��� �Ÿ� ���� �ڷ� �߰�");
		System.out.println("4. ���α׷� ����");
		System.out.println("***********************");
		
		System.out.print("���� �޴��� �����ϼ��� : ");
		
		return s.nextInt();
	}
	
	public int getRandCnt() {
		int menu = 0;
		try {
			System.out.println("**************");
			System.out.println("���� �ڷ� �߰� ����");
			System.out.println("**************");
			System.out.print("������ �Է��ϼ��� : ");
			menu = s.nextInt();
			System.out.println(menu + "�� ���� �ڷḦ �Է��߽��ϴ�.");
			return menu;
			//return s.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("====== ���ڸ� �ٽ� �Է��ϼ���. ======");
			
		}
		return menu;
	}
}