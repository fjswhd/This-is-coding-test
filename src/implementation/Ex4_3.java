package implementation;

import java.util.Scanner;

public class Ex4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//위치 입력
		String[] loc = sc.nextLine().split("");
		
		//위치를 좌표로 치환
		char c = loc[0].charAt(0);
		
		int x = Integer.parseInt(loc[1]);
		int y = c - 'a' + 1;
		
		//좌표에서 움직이는 경우의 조합
		int[] dx = {-2, -2, 2, 2, 1, -1, 1, -1};
		int[] dy = {1, -1, 1, -1, 2, 2, -2, -2};
		
		//움직이고 범위를 벗어나면 카운트하지 않음
		int answer = 0;
		
		for (int i = 0; i < dx.length; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			
			if (newX < 1 || newX > 8 || newY < 1 || newY > 8) {
				continue;
			}
			
			answer++;
		}
		
		System.out.println(answer);
		
	}
}
