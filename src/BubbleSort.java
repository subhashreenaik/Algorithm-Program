import java.util.Arrays;

public class BubbleSort <T extends Comparable<T>> {
	public static <T extends Comparable<T>> void bubbleSort(T[] list, int n) {
		T temp;
		for (int i = n - 1; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				
				if (list[j].compareTo(list[j + 1]) > 0) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Integer[] arr = { 25, 96, 1, 56, 7, 10, 100, 111, 10, 34 };
		bubbleSort(arr, arr.length);
		System.out.println("Sorted Array: ");
		System.out.println(Arrays.toString(arr));
	}

}
