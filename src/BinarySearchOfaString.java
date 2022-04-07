import java.util.Scanner;

public class BinarySearchOfaString {
	public static int stringBinarySearch(String[] arr, String key) {
		int start = 0, end = arr.length - 1, mid;
		while (start <= end) {
			mid = start + (end - start) / 2;

			if (arr[mid].equals(key))
				return mid;

			if (arr[mid].compareTo(key) > 0)
				start = mid + 1;

			else
				end = mid - 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your string");
		String str=scanner.nextLine();
		String[] strArr = str.split(",");
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		System.out.println();
		System.out.println("Enter key to search");
		String key = scanner.next();
		int index = stringBinarySearch(strArr, key);
		if (index >= 0)
			System.out.println("Key found at index : " + index + " which is : " + strArr[index]);
		else if(index==-1) {
			System.out.println("Key not found");
		}
		
		scanner.close();
	}
}
