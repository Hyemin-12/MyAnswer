package BuyClothes;

public class BuyClothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("������", 100000, 0);
		Seller se1 = new Seller("������", 1000, 10);
		//�� ���� �ϱ� �� ����
		st1.printStudent();
		se1.printSeller();
		//����
		st1.BuyClothes(se1, 11);
		//�� ���� �� ����
		st1.printStudent();
		se1.printSeller();
	}

}
