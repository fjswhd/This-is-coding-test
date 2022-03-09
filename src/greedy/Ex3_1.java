package greedy;

import java.util.Scanner;

public class Ex3_1 {
	public static void main(String[] args) {
		int[] changes = {500, 100, 50, 10};
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int answer = 0;
		
		for (int i = 0; i < changes.length; i++) {
			answer += N / changes[i];
			N %= changes[i];
		}
		
		
		System.out.println(answer);
				
	}
}
