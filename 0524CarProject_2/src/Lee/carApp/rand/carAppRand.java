package Lee.carApp.rand;

import java.util.Random;

public class carAppRand {
	
	private String name[] = {"ȫ�浿", "��浿", "�ڱ浿", "�̱浿", "�ֱ浿"};
	private String tell[] = {"010-1234-5678", "010-4321-5678", "010-3478-1278",
				"010-4523-1978", "010-7890-2134"};
	private String address[] = {"�뱸�� ���� �ž�4��", "����� ���� �ž�4��",
				"�λ�� ���� �ž�4��", "��õ�� ���� �ž�4��", "���ֽ� ���� �ž�4��"};
	private String model[] = {"SM6", "�Ÿ", "��Ÿ��", "K7", "�׷���"};
	private String color[] = {"��", "����", "���", "ȸ��", "����"};
	private int year[] = {2016, 2017, 2016, 2017, 2016};
	private String company[] = {"�Ｚ����", "����", "����", "���", "����"};
	
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
