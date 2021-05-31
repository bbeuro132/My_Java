package com.lg.studApp.main;

import java.util.Random;
import com.lg.studApp.model.Student;

public class studMain {

	public static void main(String[] args) {
		String name[] = {"홍길동", "김길동", "박길동", "최길동", "이길동"};
		int age[] = {50,60,70,80,90};
		char gender[] = {'남', '여'};
		String address[] = {"대구시 동구 신천1동", 
				"대구시 동구 신천2동", "대구시 동구 신천3동",
				"대구시 동구 신천4동", "대구시 동구 신천5동"};
		
		Random r = new Random();
		Student[] st = new Student[10];
		
		
		for (int i = 0; i < st.length; i++) {
	
			st[i] = new Student(name[r.nextInt(name.length)], 
					age[r.nextInt(age.length)], 
					gender[r.nextInt(gender.length)], 
					address[r.nextInt(address.length)]);
			
			if (i == 9) {
				st[9] = new Student("전우치", 24, '남', "조선 한양인근 두메산골");	
			}

			System.out.println((i+1)+ "번째 출력");
			st[i].showStInfo();
			System.out.println();
		}
		
		
		
	}
		
}


