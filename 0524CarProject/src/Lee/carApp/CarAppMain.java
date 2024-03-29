package Lee.carApp;

import java.util.ArrayList;

import Lee.carApp.car.Car;
import Lee.carApp.customer.Customer;
import Lee.carApp.rand.carAppRand;

public class CarAppMain {

	public static void main(String[] args) {	
		Customer[] cus = new Customer[10];
		
		ArrayList<Customer> arrList = new ArrayList<Customer>();
		//<> <-- 제네릭 클래스
		//<> 내부에 원하는 타입을 넣을 수 있다.
		
		carAppRand r = new carAppRand();
		for (int i = 0; i < cus.length; i++) {
			
			cus[i] = new Customer(r.randName(), r.randTell(),
								r.randAdd(), 
								new Car(r.randModel(),
								r.randColor(), r.randYear(), r.randCompany()));
			
			//Customer 객체 내에서 Car 객체를 생성했기 때문에, new Car를 선언할 수 있다.
			
			System.out.println((i+1) + "번째 출력");
			cus[i].printCustomerInfo();
			System.out.println();
			arrList.add(cus[i]);
		}
		System.out.println("*****************");
		System.out.println("ArrayList 고객 정보");
		System.out.println("*****************");
		for (int i = 0; i < arrList.size(); i++) {
			//Customer cuList = arrList.get(i);
			//cuList.printCustomerInfo();
			arrList.get(i).printCustomerInfo();
			System.out.println();
		}
		
		
		
	}

}
