package my.day05;

public class  Staff extends Person
{
	private String name;
	private int no;
	private String dept;

	public void setName(String name){
		this.name=name;
	}
	public void setNo(int no){
		this.no=no;
	}
	public void setDept(String dept){
		this.dept=dept;
	}
	public String getName(){
		return name;//this.name;
	}
	public int getNo(){
		return no;
	}
	public String getDept(){
		return dept;
	}
	public void printInfo(){
		System.out.println("---���� ����---");
		System.out.println("�̸�: "+name);
		System.out.println("���: "+no);
		System.out.println("�μ�: "+dept);
	}//------------
	
}////////////////////////
