package my.day04;

public class Person {
	/*	이름, 나이, 성별, 전화번호
		
	*/
	private String name;
	private String sex;
	private int age;
	private String phone;
	
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
}
