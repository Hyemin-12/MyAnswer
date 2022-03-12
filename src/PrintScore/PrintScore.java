package PrintScore;
import java.util.Scanner;
//2차원 배열과 for문을 사용하여 -> 세 팀의 수학,영어,국어 점수를 입력받아 출력하는 프로그램
public class PrintScore{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[][] team = new int[3][3];
		
		for(int i = 0; i < team.length; i++) {
			for(int j = 0; j < team.length; j++) {
				switch(j) {
				case 0:System.out.print(i+1 + "번째 팀의 수학 점수 : "); break;
				case 1:System.out.print(i+1 + "번째 팀의 영어 점수 : "); break;
				case 2:System.out.print(i+1 + "번째 팀의 국어 점수 : "); break;
				}
				team[i][j] = scan.nextInt();
			}
		}
		System.out.println("------------------------------");
		System.out.println("\t수학\t영어\t국어");
		for(int i = 0; i < team.length; i++) {
			System.out.print(i+1 + "조\t");
			for(int j = 0; j < team.length; j++) {
				 System.out.print(team[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		
	}

}
