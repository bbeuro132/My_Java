package Lee.carApp.handler;

import java.util.ArrayList;
import java.util.Scanner;

import Lee.carApp.car.Car;
import Lee.carApp.customer.Customer;
import Lee.carApp.rand.carAppRand;

public class CarSellMgr {
	carAppRand r = new carAppRand();
	Scanner s = new Scanner(System.in);
	ArrayList<Customer> cuList = new ArrayList<Customer>();
	
	private int RandSelect;
	
	public void showSellinfo() {
		
		if (cuList != null) {
			for (Customer cu : cuList) {
				cu.printCustomerInfo();
			}
		}
		else {
			System.out.println("자료가 없습니다.");
			return;
		}
		
	}
	
	public void randInsData() {
		
		cuList.add(new Customer(r.randName(), r.randTell(), r.randAdd(), 
				new Car(r.randModel(),
				r.randColor(), r.randYear(), r.randCompany())));
	}
	
	public void randInsData(int size) {
		
		for (int i = 0; i < size; i++) {
			
			cuList.add(new Customer(r.randName(), r.randTell(), r.randAdd(), 
					new Car(r.randModel(),
					r.randColor(), r.randYear(), r.randCompany())));
		}

	}
	
	public void insData() {
		
	}
	
	
	public void mainExit() {
		System.exit(0);
	}
	
}
