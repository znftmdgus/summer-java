package my.day05;

public class House {
	
	int room;
	String name;
	String color;
	int price;
	private int roomCount;
	
	public void setRoomCount(int count) {
		roomCount = count;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void houseBuy(int price) {
		System.out.println(price+"���� ���� ��ϴ�");
	}
	public static void houseSale(int price) {
		System.out.println(price+"���� ���� �˴ϴ�");
	}
	public static void housePrice(int price) {
		System.out.println(price+"���Դϴ�.");
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getRoomCount() {
		return roomCount;
	}

}
