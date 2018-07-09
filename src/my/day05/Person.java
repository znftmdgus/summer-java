package my.day05;

public class Person {
	/*	이름, 나이, 성별, 전화번호
		
	*/
	private String name;
	private String sex;
	private int age;
	private String phone;
	
	//기본 생성자 메소드
	public Person() {
		
	}
	//4개의 데이터를 갖는 생성자 메소드 정의
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
		String info = name + "정보";
		info += "\n나이 : " + age+"\n번호 : " +phone+"\n성별 : " + sex;
		return info;
		
	}
	
}
