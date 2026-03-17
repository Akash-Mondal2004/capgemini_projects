package dsa.array;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElements {
	public static int[] arr = {1, 2, 3, 2, 1, 3, 2, 5};
	public static void main(String[] args) {
		System.out.println(arrayDuplicateElement(arr));
		System.out.println(arrayDuplicateElementMap(arr));
	}
	public static int arrayDuplicateElement(int[] arr) {
		int count = 0;
		for (int i=1; i<arr.length; i++) for (int j=0; j<i; j++) if (arr[i]==arr[j]) {
			count++;
			break;
		}
		return count;
	}
	public static int arrayDuplicateElementMap(int[] arr) {
		int count = 0;
		Map<Integer, Integer> arrayCount = new HashMap<>();
		for (int i=0; i<arr.length; i++) arrayCount.put(arr[i], arrayCount.getOrDefault(arr[i], -1) + 1);
		for (Map.Entry<Integer, Integer> entry : arrayCount.entrySet()) count += entry.getValue();
		return count;
	}
	public static int binarySearch(int[] arr, int ele, int left, int right) {
		if (left > right) return -1;
		int mid = (left+right)/2;
		if (arr[mid] == ele) return mid;
		if (arr[mid] > ele) return binarySearch(arr, ele, left, mid-1);
		return binarySearch(arr, ele, mid+1, right);
	}
}
