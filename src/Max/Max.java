package Max;
import java.util.Scanner;
//���ڸ� �Է� �޾� �ִ밪�� ���ϴ� ���α׷�(0 �Է� �� Ż��)
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		
		while(true) {
			System.out.print("���� �Է� : ");
			int num = scan.nextInt();
			
			if(num > max) {
				max = num;
			}
			
			if(num == 0) break;
		}
		System.out.println("�ִ밪�� " + max + "�Դϴ�");
	}

}
