package BuyClothes;

public class Seller {
	String name;
	int price;
	int sellerInventory;
	int sellerMoney;
	
	public Seller(String name, int price, int sellerInventory) {
		this.name = name;
		this.price = price;
		this.sellerInventory = sellerInventory;
	}
	
	public void SellClothes(int amount){
			if(sellerInventory >= amount) {
				sellerInventory -= amount;
				sellerMoney += this.price * amount;
			}else {
				System.out.println("****��� ���� �Ǹ� �Ұ�****");
			}
	}
	
	public void printSeller() {
		System.out.println("====�Ǹ����� ����====");
		System.out.println("�̸� : " + this.name);
		System.out.println("���� ���� : " + sellerMoney);
		System.out.println("���� ���� : " + sellerInventory);
	}
}
