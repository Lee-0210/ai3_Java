package Day04;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] array = new int[num];
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			
			if(min > array[i]) min = array[i];
		}
		
		System.out.println("최솟값 : " + min);
		
		sc.close();
	}
}
