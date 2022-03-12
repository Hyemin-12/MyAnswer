package BelowAvg;
import java.util.Scanner;
//배열로 숫자 10개를 입력받아 평균 이하의 수만 입력하는 프로그램
public class BelowAvg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] num = new int[10];
		int sum = 0;
		double avg;
	
		for(int i = 0; i < num.length; i++) {
			System.out.print(i+1 + "번째 수 입력 : ");
			num[i] = scan.nextInt();
			sum += num[i];
		}
	
		avg = (double)sum / num.length;
	
		System.out.println("평균 : " + avg);
		System.out.print("평균 이하의 수 : ");
		for(int i = 0; i < num.length; i++) {
			if(num[i] < avg) {
				System.out.print(num[i] + "   ");
			}
		}
	}
}