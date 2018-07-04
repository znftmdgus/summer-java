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
			
			System.out.println("0 과 100사이 값을 입력");
			int i = scan.nextInt();
			if(i>=0 && i<=100) {
				//System.out.println("올바른 입력");
				if(i==num) {
					System.out.println(count+"번 만에 정답입니다");
					break;
				}else if(i > num) {
					count++;
					System.out.println("난수보다 큽니다");
				}else {
					count++;
					System.out.println("난수보다 작습니다");
					
				}
			}
			System.out.println("잘못된 입력");
			
			
		}
	
	}
		
}
