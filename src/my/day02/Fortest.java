package my.day02;

public class Fortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum1 =0;
		int sum2 =0;
		
		
		for(int i = 1; i<11; i++) {

			int result = i % 2;
			
			/*if(result == 0) {
				sum1 = sum1 + i;
				
			}else if(result == 1) {
				sum2 = sum2 + i;
				
			}else {
				sum1 = sum1;
				sum2 = sum2;
				
			}*/
			switch(result) {
			case 0: sum1 = sum1 + i;
					
					
				break;
			case 1: 
				
				sum2 = sum2 + i;
				
					break;
				default:
					break;
			}
		}
		System.out.println("Â¦¼öÀÇ ÇÕÀº" + sum1);
		System.out.println("È¦¼öÀÇ ÇÕÀº" + sum2);
		
	}

}
