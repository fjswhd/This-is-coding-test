package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		int[] numbers = new int[N];
		
		for (int i = 0; i < N; i++) {
			numbers[i] = sc.nextInt();
		}
		
		Arrays.sort(numbers);
		
		//가장 큰 수와 두번째 큰 수만 더해질 것
		int max1 = numbers[N-1];
		int max2 = numbers[N-2];
		
		int answer = 0;
		int index = 0;
		
//		for (int i = 0; i < M; i++) {
//			//가장 큰 수를 K번 더하기
//			if (index < K) {
//				answer += max1;
//				index++;
//				continue;
//			} 
//			
//			//가장 큰 수를 이미 K번 더했으면 두번째 큰 수 한 번 더하기
//			answer += max2;
//			index = 0;
//			
//		}
		
		//위 과정은 M이 커지면 시간초과 가능성
		//아래 식으로 단순화 가능
		//다른 문제에서도 이처럼 단순화할 수 없는지 고민해볼 필요 있음
		answer = (M/(K+1))*(K*max1 + max2) + M%(K+1)*max1;
		
		
		System.out.println(answer);
	}
}
