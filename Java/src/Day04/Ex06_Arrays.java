package Day04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06_Arrays {
	
	public static void main(String[] args) {
		// 정방 행렬
		// [][][]
		// [][][]
		
		// 비정방 행렬
		// [][]
		// [][][][]
		// [][][]
		
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		// arr 2차원 배열에 정수를 입력받아보세요.
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// for-each 출력
		for(int[] i : arr) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		// 다차원 배열 메서드
		System.out.println(Arrays.deepToString(arr));
		
		sc.close();
	}
}
