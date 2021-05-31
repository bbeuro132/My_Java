package Lee.carApp.rand;

import java.util.Random;

public class carAppRand {
	
	private String name[] = {"홍길동", "김길동", "박길동", "이길동", "최길동"};
	private String tell[] = {"010-1234-5678", "010-4321-5678", "010-3478-1278",
				"010-4523-1978", "010-7890-2134"};
	private String address[] = {"대구시 동구 신암4동", "서울시 동구 신암4동",
				"부산시 동구 신암4동", "인천시 동구 신암4동", "광주시 동구 신암4동"};
	private String model[] = {"SM6", "쏘나타", "싼타페", "K7", "그랜져"};
	private String color[] = {"블랙", "은색", "흰색", "회색", "빨강"};
	private int year[] = {2016, 2017, 2016, 2017, 2016};
	private String company[] = {"삼성르노", "현대", "현대", "기아", "현대"};
	
	Random r = new Random();
	
	public String randName() {
		return name[r.nextInt(name.length)];
	}
	public String randTell() {
		return tell[r.nextInt(tell.length)];
	}
	public String randAdd() {
		return address[r.nextInt(address.length)];
	}
	public String randModel() {
		return model[r.nextInt(model.length)];
	}
	public String randColor() {
		return color[r.nextInt(model.length)];
	}
	public int randYear() {
		return year[r.nextInt(year.length)];
	}
	public String randCompany() {
		return company[r.nextInt(company.length)];
	}

}
