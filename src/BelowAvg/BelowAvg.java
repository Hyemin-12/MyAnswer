package BelowAvg;
import java.util.Scanner;
//�迭�� ���� 10���� �Է¹޾� ��� ������ ���� �Է��ϴ� ���α׷�
public class BelowAvg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		int sum = 0;
		double avg;
	
		for(int i = 0; i < num.length; i++) {
			System.out.print(i+1 + "��° �� �Է� : ");
			num[i] = scan.nextInt();
			sum += num[i];
		}
	
		avg = (double)sum / num.length;
	
		System.out.println("��� : " + avg);
		System.out.print("��� ������ �� : ");
		for(int i = 0; i < num.length; i++) {
			if(num[i] < avg) {
				System.out.print(num[i] + "   ");
			}
		}
	}
}