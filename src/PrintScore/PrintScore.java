package PrintScore;
import java.util.Scanner;
//2���� �迭�� for���� ����Ͽ� -> �� ���� ����,����,���� ������ �Է¹޾� ����ϴ� ���α׷�
public class PrintScore{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[][] team = new int[3][3];
		
		for(int i = 0; i < team.length; i++) {
			for(int j = 0; j < team.length; j++) {
				switch(j) {
				case 0:System.out.print(i+1 + "��° ���� ���� ���� : "); break;
				case 1:System.out.print(i+1 + "��° ���� ���� ���� : "); break;
				case 2:System.out.print(i+1 + "��° ���� ���� ���� : "); break;
				}
				team[i][j] = scan.nextInt();
			}
		}
		System.out.println("------------------------------");
		System.out.println("\t����\t����\t����");
		for(int i = 0; i < team.length; i++) {
			System.out.print(i+1 + "��\t");
			for(int j = 0; j < team.length; j++) {
				 System.out.print(team[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		
	}

}
