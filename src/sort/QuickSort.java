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
		//정렬하는 원소가 1개일 때
		if (start >= end) 
			return;
		
		//피벗과 원소 인덱스
		int pivot = start;
		int left = start + 1;
		int right = end;
		
		//왼쪽 인덱스가 오른쪽 인덱스보다 작을 때 실행
		while (left < right) {
			System.out.println(left + " " + right);
			
			//피벗 보다 큰 데이터 찾을 때 까지 인덱스 증가
			while (left < end && array[left] <= array[pivot]) 
				left += 1;
			
			//피벗보다 작은 데이터 찾을 때 까지 인덱스 감소
			while (right > start && array[right] >= array[pivot])
				right -= 1;
			
			//만약 인덱스가 엇갈렸으면 작은 데이터와 피벗을 교체
			if (left > right) {
				int tmp = array[right];
				array[right] = array[pivot];
				array[pivot] = tmp;
			} 
			//엇갈리지 않았으면 작은 데이터와 큰 데이터 교체
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
