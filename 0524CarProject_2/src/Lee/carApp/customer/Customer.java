package Lee.carApp.customer;

import Lee.carApp.car.Car;

public class Customer{
	
	private String name;
	private String tel;
	private String address;
	Car car; //클래스 호출
		
	
	public Customer(String name, String tel, String address,
				Car car) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
		this.car = car;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void printCustomerInfo() {
	
		System.out.println("\n이름 : " + name);
		System.out.println("전화번호 : " + tel);
		System.out.println("주소 : " + address);
		car.printCarInfo();
		System.out.println();
	}
	

}
