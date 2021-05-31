package Lee.carApp;

import java.util.ArrayList;

import Lee.carApp.car.Car;
import Lee.carApp.carApp.view.Menu;
import Lee.carApp.customer.Customer;
import Lee.carApp.handler.CarSellMgr;
import Lee.carApp.rand.carAppRand;

public class CarAppMain {

	public static void main(String[] args) {	
		Menu m = new Menu();
		CarSellMgr csm = new CarSellMgr(); 
		
		while (true) {
			switch (m.mainMenu()) {
			case Menu.MAIN_MENU_VIEW:
				//System.out.println("�߰��� �Ÿ� ��Ȳ����");
				csm.showSellinfo();
				break;
			case Menu.MAIN_MENU_RAND_INS:
				System.out.println("�߰��� �Ÿ� ���� �ڷ� �߰�");
				csm.randInsData(m.getRandCnt());	
				break;
			case Menu.MAIN_MENU_INS:
				System.out.println("�߰��� �Ÿ� ���� �ڷ� �߰�");
				csm.insData();
				break;
			case Menu.MAIN_MENU_EXIT:
				System.out.println("���α׷� ����");
				csm.mainExit();
				
			}
			System.out.println();
		}
		
		
		
	}

}