package Day06;

public class Test {
	static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int blank = 0;
		int[] arr = {5, 4, 7, 6, 1, 9};
		
		printArr(arr);
		
		for (int i = 0; i < arr.length/2; i++) {
			System.out.println(arr[i] + "와 " + arr[arr.length -1 -i] + "교환");
			blank = arr[i];
			arr[i] = arr[arr.length -1 -i];
			arr[arr.length -1 -i] = blank;
			printArr(arr);
		}
		System.out.println();
		printArr(arr);
	}
}
