package my.day04;

import java.util.Scanner;

import my.day05.Person;

public class Employee {
	
	String name;
	int age;
	String sex;
	String phone;
	
	
	private static Scanner scan;
	private static Scanner scan2;
	
	public void showMenu() {
		System.out.println("Employee v1.0");
		System.out.println("1. 구직 등록");
		System.out.println("2. 구인 등록");
		System.out.println("3. 구직자 정보");
		System.out.println("4. 회사 정보");
		System.out.println("5. 종료");
		System.out.println("메뉴를 선택하세요 > ");
		System.out.println("--------------");
		
	}
	
	public static void inputPerson() {
		Scanner scan = new Scanner(System.in);
		Person p = new Person();
		
		System.out.println("구직 등록 start");
		
		System.out.println("이름을 입력하세요");
		p.setName(scan.next());
		System.out.println("전화번호를 입력하세요");
		p.setPhone(scan.next());
		System.out.println("나이을 입력하세요");
		p.setAge(scan.nextInt());
		System.out.println("성별을 입력하세요");
		//System.out.println("1. 남자 2. 여자");
		p.setSex(scan.next());
		
		String info = p.showPro();
		System.out.println(info);
			
	}
	
	public Person[] addPerson() {
		Person[] p = new Person[10];
		for(int i =0; i<p.length; i++) {
			p[i] = new Person(name, age, sex, phone);
		}
		return p;
	}
	
	public static void main(String[] args) {
		
		Person p = new Person();
		Employee E = new Employee();
		scan2 = new Scanner(System.in);
		
		
		while(true) {
			E.showMenu();
			int no = scan2.nextInt();
			if(no==5) {
				System.exit(0);
				
			}else if(no==1) {
				E.inputPerson();
			}
		}
		
		/*p.setAge(20);
		p.setName("이승현");
		p.setPhone("01090803087");
		p.setSex("남");
		int age = p.getAge();
		String name = p.getName();
		String phone = p.getPhone();
		String sex = p.getSex();
		
		System.out.println(age);
		System.out.println(name);
		System.out.println(sex);
		System.out.println(phone);
		 */
	}

}
