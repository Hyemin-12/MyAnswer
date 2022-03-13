package GCD;
import java.util.Scanner;
//배열을 생성하여 원하는 개수만큼 넣은 후 입력한 수들 중 최댓값과 최소값을 구한 후 두 수의 최대공약수를 구하시오
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("몇개의 숫자를 입력하시겠습니까 : ");
		int n = scan.nextInt();
		
		int num[] = new int[n];
		int max = 0;
		int min = 999;
		int gcd = 0; 
		int temp;
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("숫자 입력 : ");
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
		System.out.println("최댓값  : " + max);
		System.out.println("최솟값 : " + min);
		System.out.println("최대공약수 : " + gcd);
	}

}
