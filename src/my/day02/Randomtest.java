package my.day02;

import java.util.*;

public class Randomtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int num = rand.nextInt(100); 							
		
		Scanner scan = new Scanner(System.in);
		int count = 1;
		
		while(true) {
			
			System.out.println("0 �� 100���� ���� �Է�");
			int i = scan.nextInt();
			if(i>=0 && i<=100) {
				//System.out.println("�ùٸ� �Է�");
				if(i==num) {
					System.out.println(count+"�� ���� �����Դϴ�");
					break;
				}else if(i > num) {
					count++;
					System.out.println("�������� Ů�ϴ�");
				}else {
					count++;
					System.out.println("�������� �۽��ϴ�");
					
				}
			}
			System.out.println("�߸��� �Է�");
			
			
		}
	
	}
		
}
