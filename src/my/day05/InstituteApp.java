package my.day05;

public class InstituteApp {
	
	public static void main(String[] args) {
		Student stu =  new Student();
		stu.setName("�̽���");
		stu.setCname("�ڹ�");
		stu.setNo(20131635);
		
		Student stu2 =  new Student();
		stu2.setName("�����");
		stu2.setCname("����");
		stu2.setNo(20131633);
		
		
		Teacher t = new Teacher();
		t.setName("�̼���");
		t.setNo(2013);
		t.setSubject("���ͳ� ���α׷���");

		Staff s = new Staff();
		s.setName("�̼���");
		s.setNo(2016);
		s.setDept("��ǻ��");
		
		Student arrStu[] = new Student[4];
		arrStu[0] = stu;
		arrStu[1] = stu2;
		
		for(int i = 0; i<arrStu.length; i++) {
			if(i == 2 || i ==3) {
				System.out.println("����");
			}
			else {
			System.out.println("�̸� : "+ arrStu[i].getName());
			System.out.println("�й� : "+ arrStu[i].getNo()+"\n-------------");
			}
		}
	}

}
