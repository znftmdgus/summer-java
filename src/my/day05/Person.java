package my.day05;

public class Person {
	/*	�̸�, ����, ����, ��ȭ��ȣ
		
	*/
	private String name;
	private String sex;
	private int age;
	private String phone;
	
	//�⺻ ������ �޼ҵ�
	public Person() {
		
	}
	//4���� �����͸� ���� ������ �޼ҵ� ����
	public Person(String name, int age, String sex, String phone) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	
	
	public String showPro() {
		String info = name + "����";
		info += "\n���� : " + age+"\n��ȣ : " +phone+"\n���� : " + sex;
		return info;
		
	}
	
}
