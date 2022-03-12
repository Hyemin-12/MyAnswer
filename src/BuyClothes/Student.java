package BuyClothes;
//�л��� ���� ��� Ŭ����
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
			System.out.println("****�ܾ� ���� ���� �Ұ�****");
		}
	}
	
	public void printStudent() {
		System.out.println("====�������� ����====");
		System.out.println("�̸� : " + this.name);
		System.out.println("���� ���� : " + this.money);
		System.out.println("���� ���� : " + this.inventory);
	}
}
