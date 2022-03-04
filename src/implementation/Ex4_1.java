package implementation;

import java.util.Arrays;

public class Ex4_1 {	
	public static void main(String[] args) {
		//현재 좌표
		int[] loc = {1, 1};
		
		//공간 범위
		int N = 5;
		
		//커맨드
		String[] commands = {"R", "R", "R", "U", "D", "D"};
		
		for (int i = 0; i < commands.length; i++) {
			loc = move2(loc, N, commands[i]);
		}
		
		System.out.println(Arrays.toString(loc));
	}
	
	//이 방식은 각각의 커맨드에 대해서 해당하는 로직을 일일히 다 작성해줘야함
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
	
	//이 방식은 모든 커맨드에 따라 좌표를 이동시켜야하니 이동해야하는 좌표값만 커맨드에 맞게 설정하고 커맨드가 들어오면 이동시키기
	private static int[] move2(int[] loc, int N, String command) {
		String[] commands = {"U", "D", "L", "R"};
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		//다음 좌표
		int x = loc[0];
		int y = loc[1];
		
		for (int i = 0; i < commands.length; i++) {
			//주어진 커맨드와 일치하면 다음 좌표로 이동
			if (command.equals(commands[i])) {
				x += dx[i];
				y += dy[i];
			}
			
			//다음 좌표가 기준을 벗어나면
			if (x < 1 || x > N || y < 1 || y > N) {
				continue;
			}
			
			//다음 좌표를 반영
			loc[0] = x;
			loc[1] = y;
		}
		
		return loc;
	}
}	
