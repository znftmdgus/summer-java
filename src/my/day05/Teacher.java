package my.day05;

public class  Teacher
{
	private String name;//�������-�ν��Ͻ�����
	private int no;
	private String subject;

	public void setName(String name){
		//�Ű�����name: ��������
		this.name=name;
		//�������=��������

		//��������� ���������� �̸��� ������ ���
		//������������ �켱���� �ִ�.
		//�̷� ��� ��������� ���������� ������
		//�ʿ䰡 �ִµ�...�� �������
		//�������(�ν��Ͻ�����) �տ� this. �� �ٿ�����.
	}
	public void setNo(int no){
		this.no=no;
	}
	public void setSubject(String subject){
		this.subject=subject;
	}
	public String getName(){
		return name;//this.name;
	}
	public int getNo(){
		return no;
	}
	public String getSubject(){
		return subject;
	}
	public void printInfo(){
		System.out.println("---���� ����---");
		System.out.println("�̸�: "+name);
		System.out.println("����: "+no);
		System.out.println("����: "+subject);
	}//--------------------
}///////////////////////////////////
