package my.day03;


import java.util.Arrays;

public class Arrex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"a","ab","abc","abcd","abcde"};
		String[] b = a;
		
		for(int i = 0; i< a.length; i++) {
			System.out.println("a["+i+"] = "+ a[i]);
			System.out.println("b["+i+"] = "+ b[i]);
		}
		
		//int[] b = {20,40,60,80,100};
		b[0] = "a";
		b[1] = "ab";
		b[2] = "abc";
		b[3] = "abcd";
		b[4] = "abcde";
	
		Arrays.sort(a);
		for(int i = 0; i< a.length; i++) {
			System.out.println("a["+i+"] = "+ a[i]);
			System.out.println("b["+i+"] = "+ b[i]);
		}
	}

}
