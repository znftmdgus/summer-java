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
		System.out.println("1. ���� ���");
		System.out.println("2. ���� ���");
		System.out.println("3. ������ ����");
		System.out.println("4. ȸ�� ����");
		System.out.println("5. ����");
		System.out.println("�޴��� �����ϼ��� > ");
		System.out.println("--------------");
		
	}
	
	public static void inputPerson() {
		Scanner scan = new Scanner(System.in);
		Person p = new Person();
		
		System.out.println("���� ��� start");
		
		System.out.println("�̸��� �Է��ϼ���");
		p.setName(scan.next());
		System.out.println("��ȭ��ȣ�� �Է��ϼ���");
		p.setPhone(scan.next());
		System.out.println("������ �Է��ϼ���");
		p.setAge(scan.nextInt());
		System.out.println("������ �Է��ϼ���");
		//System.out.println("1. ���� 2. ����");
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
		p.setName("�̽���");
		p.setPhone("01090803087");
		p.setSex("��");
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
