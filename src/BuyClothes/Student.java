package BuyClothes;
//학생이 옷을 사는 클래스
public class Student {
	String name;
	int money;
	int inventory;
	
	public Student(String name, int money, int inventory) {
		this.name = name;
		this.money = money;
		this.inventory = inventory;
	}
	
	public void BuyClothes(Seller clothes, int amount) {
		if(money >= clothes.price * amount) {
			clothes.SellClothes(amount);
			money -= clothes.price * amount;
			inventory += amount;
		}else {
			System.out.println("****잔액 부족 구매 불가****");
		}
	}
	
	public void printStudent() {
		System.out.println("====구매자의 정보====");
		System.out.println("이름 : " + this.name);
		System.out.println("재정 상태 : " + this.money);
		System.out.println("보유 상태 : " + this.inventory);
	}
}
