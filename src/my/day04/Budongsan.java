package my.day04;

import java.util.Scanner;

public class Budongsan {

	public static void main(String[] args) {
		
		House h = new House();	//��ü ������ �޼ҵ�
		
		/*Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		String name = scan.nextStr();
		*/
		
		h.price = 1000;
		h.room = 2000;
		//h.name = "�̽���";
		h.setName("�̽��� ����");
		h.setRoomCount(4);
		
		String n = h.getName();
		int a = h.getPrice();
		int room = h.getRoomCount();
		
		System.out.println("�������� "+n);
		System.out.println(a);
		System.out.println("���� ���� "+room);
		h.houseBuy(a);
	}

}
