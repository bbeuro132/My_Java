package com.lg.studApp.main;

import java.util.Random;
import com.lg.studApp.model.Student;

public class studMain {

	public static void main(String[] args) {
		String name[] = {"ȫ�浿", "��浿", "�ڱ浿", "�ֱ浿", "�̱浿"};
		int age[] = {50,60,70,80,90};
		char gender[] = {'��', '��'};
		String address[] = {"�뱸�� ���� ��õ1��", 
				"�뱸�� ���� ��õ2��", "�뱸�� ���� ��õ3��",
				"�뱸�� ���� ��õ4��", "�뱸�� ���� ��õ5��"};
		
		Random r = new Random();
		Student[] st = new Student[10];
		
		
		for (int i = 0; i < st.length; i++) {
	
			st[i] = new Student(name[r.nextInt(name.length)], 
					age[r.nextInt(age.length)], 
					gender[r.nextInt(gender.length)], 
					address[r.nextInt(address.length)]);
			
			if (i == 9) {
				st[9] = new Student("����ġ", 24, '��', "���� �Ѿ��α� �θ޻��");	
			}

			System.out.println((i+1)+ "��° ���");
			st[i].showStInfo();
			System.out.println();
		}
		
		
		
	}
		
}


