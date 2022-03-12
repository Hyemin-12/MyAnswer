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
				System.out.println("****재고 부족 판매 불가****");
			}
	}
	
	public void printSeller() {
		System.out.println("====판매자의 정보====");
		System.out.println("이름 : " + this.name);
		System.out.println("수익 상태 : " + sellerMoney);
		System.out.println("보유 상태 : " + sellerInventory);
	}
}
