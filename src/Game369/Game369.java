package Game369;
//���� �߿� 3�� ��� ��(3,6,9)�� �����ϰ� ������ �� ���Ե� ������ŭ �ڼ��� ġ�� 369������ 1���� 100���� ����ϴ� ���α׷��� �ۼ��϶�.
public class Game369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		for(int i = 1; i <= 100; i++) {
			num1 = i / 10;
			num2 = i % 10;
			System.out.print(i + " ");
			if((num1 % 3 == 0) && (num2 % 3 == 0)) {
				System.out.print("¦¦");
			}else if((num1 % 3 == 0) || (num2 % 3 == 0)) {
				System.out.print("¦");
			}
			System.out.println();
		}
	}

}
