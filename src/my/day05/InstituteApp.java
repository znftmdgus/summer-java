package my.day05;

public class InstituteApp {
	
	public static void main(String[] args) {
		Student stu =  new Student();
		stu.setName("이승현");
		stu.setCname("자바");
		stu.setNo(20131635);
		
		Student stu2 =  new Student();
		stu2.setName("삼승현");
		stu2.setCname("보안");
		stu2.setNo(20131633);
		
		
		Teacher t = new Teacher();
		t.setName("이선생");
		t.setNo(2013);
		t.setSubject("인터넷 프로그래밍");

		Staff s = new Staff();
		s.setName("이서브");
		s.setNo(2016);
		s.setDept("컴퓨터");
		
		Student arrStu[] = new Student[4];
		arrStu[0] = stu;
		arrStu[1] = stu2;
		
		for(int i = 0; i<arrStu.length; i++) {
			if(i == 2 || i ==3) {
				System.out.println("없음");
			}
			else {
			System.out.println("이름 : "+ arrStu[i].getName());
			System.out.println("학번 : "+ arrStu[i].getNo()+"\n-------------");
			}
		}
	}

}
