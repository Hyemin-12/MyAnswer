package GCD;
import java.util.Scanner;
//�迭�� �����Ͽ� ���ϴ� ������ŭ ���� �� �Է��� ���� �� �ִ񰪰� �ּҰ��� ���� �� �� ���� �ִ������� ���Ͻÿ�
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("��� ���ڸ� �Է��Ͻðڽ��ϱ� : ");
		int n = scan.nextInt();
		
		int num[] = new int[n];
		int max = 0;
		int min = 999;
		int gcd = 0; 
		int temp;
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("���� �Է� : ");
			num[i] = scan.nextInt();
			
			if(max < num[i]) {
				max = num[i];
			}
			if(min > num[i]) {
				min = num[i];
			}
		}
		if(max % min != 0) {
			gcd = max % min;
			while(max % min == 0) {
				temp  = min % gcd;
			}
		}else {
			gcd = min;
		}
		System.out.println("�ִ�  : " + max);
		System.out.println("�ּڰ� : " + min);
		System.out.println("�ִ����� : " + gcd);
	}

}
