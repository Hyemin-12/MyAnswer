package BuyClothes;

public class BuyClothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("최혜민", 100000, 0);
		Seller se1 = new Seller("김유진", 1000, 10);
		//옷 구매 하기 전 상태
		st1.printStudent();
		se1.printSeller();
		//구매
		st1.BuyClothes(se1, 11);
		//옷 구매 후 상태
		st1.printStudent();
		se1.printSeller();
	}

}
