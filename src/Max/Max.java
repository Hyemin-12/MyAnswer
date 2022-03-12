package Max;
import java.util.Scanner;
//숫자를 입력 받아 최대값을 구하는 프로그램(0 입력 시 탈출)
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int max = 0;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = scan.nextInt();
			
			if(num > max) {
				max = num;
			}
			
			if(num == 0) break;
		}
		System.out.println("최대값은 " + max + "입니다");
	}

}
