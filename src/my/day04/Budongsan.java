package my.day04;

import java.util.Scanner;

public class Budongsan {

	public static void main(String[] args) {
		
		House h = new House();	//객체 생성자 메소드
		
		/*Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		String name = scan.nextStr();
		*/
		
		h.price = 1000;
		h.room = 2000;
		//h.name = "이승현";
		h.setName("이승현 주인");
		h.setRoomCount(4);
		
		String n = h.getName();
		int a = h.getPrice();
		int room = h.getRoomCount();
		
		System.out.println("집주인은 "+n);
		System.out.println(a);
		System.out.println("방의 갯수 "+room);
		h.houseBuy(a);
	}

}
