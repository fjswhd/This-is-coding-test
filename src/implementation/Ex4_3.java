package implementation;

import java.util.Scanner;

public class Ex4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//��ġ �Է�
		String[] loc = sc.nextLine().split("");
		
		//��ġ�� ��ǥ�� ġȯ
		char c = loc[0].charAt(0);
		
		int x = Integer.parseInt(loc[1]);
		int y = c - 'a' + 1;
		
		//��ǥ���� �����̴� ����� ����
		int[] dx = {-2, -2, 2, 2, 1, -1, 1, -1};
		int[] dy = {1, -1, 1, -1, 2, 2, -2, -2};
		
		//��ó�� �ΰ��� ���� ���� ������ 2���� �迭�� �Ѳ����� �� ���� �ִ�.
		int[][] moves = {
				{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}
		};
		
		//�����̰� ������ ����� ī��Ʈ���� ����
		int answer = 0;
		
		for (int i = 0; i < moves.length; i++) {
			int[] move = moves[i];
			int newX = x + move[0];
			int newY = y + move[1];
			
			if (newX < 1 || newX > 8 || newY < 1 || newY > 8) {
				continue;
			}
			
			answer++;
		}
		
		System.out.println(answer);
		
	}
}
