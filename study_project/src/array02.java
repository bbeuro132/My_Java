import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class array02 {

	public static void main(String[] args) {
		String firstName[] = {"��", "��", "��", "��", "��"};
		String middleName[] = {"��", "��", "��", "��", "��"};
		String lastName[] = {"��", "��", "��", "��", "��"};
		String fullName[] = new String[50];
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------------");
			System.out.println("���� ���� ���α׷� v1.0");
			System.out.println("------------------");
			
			System.out.println("1. �̸� ���� �� �����ϱ�");
			System.out.println("2. ���Ͽ��� �̸� �о����");
			System.out.println("3. ���α׷� ����");
			System.out.println("------------------");
			
			System.out.print("�޴� ���� : ");
			int menu = s.nextInt();
			
			switch (menu) {
				case 1:
				FileOutputStream output = null;
				try {
					output = new FileOutputStream("testJava.txt");
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				
					for (int i = 0; i < 50; i++) {
						fullName[i] = firstName[r.nextInt(4)] +
								  middleName[r.nextInt(4)] +
								  lastName[r.nextInt(4)] +
								  "\n";
						
						System.out.println((i+1) + "�� : " +fullName[i]);					
						try {
							output.write(fullName[i].getBytes());
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
					break;
				case 2:
					break;
				case 3:
					break;	
			}
		}

	}

}
