package my.day05;

public class Housedog extends Dog{
	//메소드 오버라이딩 하시오.
	public Housedog() {
		super();
		
	}
	public void sleep() {
		System.out.println(this.name +"zzz in house");
		super.sleep();
	}
	
	public static void main(String[] args) {
		
		Housedog hdog = new Housedog();
		hdog.setName("초코\n");
		hdog.sleep();
		
	}

}
