package my.day05;

public class Housedog extends Dog{
	//�޼ҵ� �������̵� �Ͻÿ�.
	public Housedog() {
		super();
		
	}
	public void sleep() {
		System.out.println(this.name +"zzz in house");
		super.sleep();
	}
	
	public static void main(String[] args) {
		
		Housedog hdog = new Housedog();
		hdog.setName("����\n");
		hdog.sleep();
		
	}

}
