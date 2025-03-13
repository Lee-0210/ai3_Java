package Day04;

import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {
		// 첫번째 주에 입력할 개수 N울 입력받고
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N개의 정수 중, 최댓값을 구하시오.
		// (입력)
		// 5
		// 90 60 70 100 55
		// (출력)
		// 최댓값 : 100
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] array = new int[num];
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			
			if(max < array[i]) max = array[i];
		}
		
		System.out.println("최댓값 : " + max);
		
		sc.close();
	}
}
