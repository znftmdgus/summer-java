package my.day05;

public class  Student
{
	private String name;
	private int no;
	private String cname;

	public void setName(String n){
		name=n;
	}
	public void setNo(int n){
		no=n;
	}
	public void setCname(String c){
		cname=c;
	}

	public String getName(){
		return name;
	}
	public int getNo(){
		return no;
	}
	public String getCname(){
		return cname;
	}
	//�л������� ����ϴ� �޼ҵ�
	public void printInfo(){
		System.out.println("---�л� ����---");
		System.out.println("�̸�: "+name);
		System.out.println("�й�: "+no);
		System.out.println("�б�: "+cname);
	}

}////////////////////////////////
