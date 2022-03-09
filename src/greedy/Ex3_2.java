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
		
		//���� ū ���� �ι�° ū ���� ������ ��
		int max1 = numbers[N-1];
		int max2 = numbers[N-2];
		
		int answer = 0;
		int index = 0;
		
//		for (int i = 0; i < M; i++) {
//			//���� ū ���� K�� ���ϱ�
//			if (index < K) {
//				answer += max1;
//				index++;
//				continue;
//			} 
//			
//			//���� ū ���� �̹� K�� �������� �ι�° ū �� �� �� ���ϱ�
//			answer += max2;
//			index = 0;
//			
//		}
		
		//�� ������ M�� Ŀ���� �ð��ʰ� ���ɼ�
		//�Ʒ� ������ �ܼ�ȭ ����
		//�ٸ� ���������� ��ó�� �ܼ�ȭ�� �� ������ ����غ� �ʿ� ����
		answer = (M/(K+1))*(K*max1 + max2) + M%(K+1)*max1;
		
		
		System.out.println(answer);
	}
}
