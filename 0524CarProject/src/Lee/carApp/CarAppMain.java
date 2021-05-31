package Lee.carApp;

import java.util.ArrayList;

import Lee.carApp.car.Car;
import Lee.carApp.customer.Customer;
import Lee.carApp.rand.carAppRand;

public class CarAppMain {

	public static void main(String[] args) {	
		Customer[] cus = new Customer[10];
		
		ArrayList<Customer> arrList = new ArrayList<Customer>();
		//<> <-- ���׸� Ŭ����
		//<> ���ο� ���ϴ� Ÿ���� ���� �� �ִ�.
		
		carAppRand r = new carAppRand();
		for (int i = 0; i < cus.length; i++) {
			
			cus[i] = new Customer(r.randName(), r.randTell(),
								r.randAdd(), 
								new Car(r.randModel(),
								r.randColor(), r.randYear(), r.randCompany()));
			
			//Customer ��ü ������ Car ��ü�� �����߱� ������, new Car�� ������ �� �ִ�.
			
			System.out.println((i+1) + "��° ���");
			cus[i].printCustomerInfo();
			System.out.println();
			arrList.add(cus[i]);
		}
		System.out.println("*****************");
		System.out.println("ArrayList ���� ����");
		System.out.println("*****************");
		for (int i = 0; i < arrList.size(); i++) {
			//Customer cuList = arrList.get(i);
			//cuList.printCustomerInfo();
			arrList.get(i).printCustomerInfo();
			System.out.println();
		}
		
		
		
	}

}