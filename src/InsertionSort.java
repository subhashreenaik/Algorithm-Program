
public class InsertionSort <T extends Comparable<T>> {
	
		T[] arr;

		/* Function to sort array using insertion sort */
		public void sort(T arr[]) {
			int n = arr.length;

			for (int i = 1; i < n; ++i) {
				T key = arr[i];
				int j = i - 1;
				/*
				 *Compare key with each element on the left of it until an element smaller than
				 *it is found.
				 */
				while (j >= 0 && arr[j].compareTo(key) > 0) {
					arr[j + 1] = arr[j];
					j--;
				}
				arr[j + 1] = key;
			}
		}

		/*
		 * print the array 
		 */
		void printArray(T[] arr) {
			int n = arr.length;
			for (int i = 0; i < n; ++i)
				System.out.print(arr[i] + " ");
			System.out.println();
		}


		public static void main(String args[]) {
			String[] arr = { "we", "are", "all", "family" };
			InsertionSort<String> sort = new InsertionSort<String>();
			sort.sort(arr);
			sort.printArray(arr);
		}
	}

