package sort;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] numbers = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8, 5, 3, 4};
		
		quickSort(numbers, 0, numbers.length - 1);
		System.out.println(Arrays.binarySearch(numbers, 5));
		
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void quickSort(int[] array, int start, int end) {
		//�����ϴ� ���Ұ� 1���� ��
		if (start >= end) 
			return;
		
		//�ǹ��� ���� �ε���
		int pivot = start;
		int left = start + 1;
		int right = end;
		
		//���� �ε����� ������ �ε������� ���� �� ����
		while (left < right) {
			System.out.println(left + " " + right);
			
			//�ǹ� ���� ū ������ ã�� �� ���� �ε��� ����
			while (left < end && array[left] <= array[pivot]) 
				left += 1;
			
			//�ǹ����� ���� ������ ã�� �� ���� �ε��� ����
			while (right > start && array[right] >= array[pivot])
				right -= 1;
			
			//���� �ε����� ���������� ���� �����Ϳ� �ǹ��� ��ü
			if (left > right) {
				int tmp = array[right];
				array[right] = array[pivot];
				array[pivot] = tmp;
			} 
			//�������� �ʾ����� ���� �����Ϳ� ū ������ ��ü
			else {
				int tmp = array[right];
				array[right] = array[left];
				array[left] = tmp;
			}
			
			System.out.println(Arrays.toString(array));
		}
		
		quickSort(array, start, right-1);
		quickSort(array, right+1, end);
		
	}
	
}
