package Game369;
//숫자 중에 3의 배수 즉(3,6,9)를 포함하고 있으면 그 포함된 개수만큼 박수를 치는 369게임을 1부터 100까지 출력하는 프로그램을 작성하라.
public class Game369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		for(int i = 1; i <= 100; i++) {
			num1 = i / 10;
			num2 = i % 10;
			System.out.print(i + " ");
			if((num1 % 3 == 0) && (num2 % 3 == 0)) {
				System.out.print("짝짝");
			}else if((num1 % 3 == 0) || (num2 % 3 == 0)) {
				System.out.print("짝");
			}
			System.out.println();
		}
	}

}
