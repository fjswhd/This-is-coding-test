package implementation;

import java.util.Arrays;

public class Ex4_1 {	
	public static void main(String[] args) {
		//���� ��ǥ
		int[] loc = {1, 1};
		
		//���� ����
		int N = 5;
		
		//Ŀ�ǵ�
		String[] commands = {"R", "R", "R", "U", "D", "D"};
		
		for (int i = 0; i < commands.length; i++) {
			loc = move2(loc, N, commands[i]);
		}
		
		System.out.println(Arrays.toString(loc));
	}
	
	//�� ����� ������ Ŀ�ǵ忡 ���ؼ� �ش��ϴ� ������ ������ �� �ۼ��������
	private static int[] move(int[] loc, int N, String command) {
		
		if (command.equals("U"))
			loc[0] += loc[0] > 1 ? -1 : 0;
			
		if (command.equals("D"))
			loc[0] += loc[0] < N ? 1 : 0;
		
		if (command.equals("L"))
			loc[1] += loc[1] > 1 ? -1 : 0;
		
		if (command.equals("R"))
			loc[1] += loc[1] < N ? 1 : 0;
		
		
		return loc;
	}
	
	//�� ����� ��� Ŀ�ǵ忡 ���� ��ǥ�� �̵����Ѿ��ϴ� �̵��ؾ��ϴ� ��ǥ���� Ŀ�ǵ忡 �°� �����ϰ� Ŀ�ǵ尡 ������ �̵���Ű��
	private static int[] move2(int[] loc, int N, String command) {
		String[] commands = {"U", "D", "L", "R"};
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		//���� ��ǥ
		int x = loc[0];
		int y = loc[1];
		
		for (int i = 0; i < commands.length; i++) {
			//�־��� Ŀ�ǵ�� ��ġ�ϸ� ���� ��ǥ�� �̵�
			if (command.equals(commands[i])) {
				x += dx[i];
				y += dy[i];
			}
			
			//���� ��ǥ�� ������ �����
			if (x < 1 || x > N || y < 1 || y > N) {
				continue;
			}
			
			//���� ��ǥ�� �ݿ�
			loc[0] = x;
			loc[1] = y;
		}
		
		return loc;
	}
}	
