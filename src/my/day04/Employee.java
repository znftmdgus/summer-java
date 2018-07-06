package my.day04;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		
		
		p.setAge(20);
		p.setName("ÀÌ½ÂÇö");
		p.setPhone("01090803087");
		p.setSex("³²");
		
		int age = p.getAge();
		String name = p.getName();
		String phone = p.getPhone();
		String sex = p.getSex();
		
		System.out.println(age);
		System.out.println(name);
		System.out.println(sex);
		System.out.println(phone);
	}

}
