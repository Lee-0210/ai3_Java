package Day06.Review;

import java.util.Scanner;

public class Ex05_Matrix {

	public static void main(String[] args) {
		// 양의 정수 M과 N을 입력받아 저장하고.
		// M행의 N열의 2차원 배열을 생성한다.
		// 각 요소의 값을 입력받고, 그대로 출력하시오.
		// (입력예시)
		// M : 2
		// N : 3
		// 1 2 3 
		// 4 5 6
		// (출력 예시)
		// 1 2 3
		// 4 5 6 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("M : ");
		int M = sc.nextInt();
		System.out.print("N : ");
		int N = sc.nextInt();
		
		// M행의 N열의 2차원 배열 선언 및 생성
		int[][] arr = new int [M][N];
		
		// 입력
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// for-each 출력
		for (int[] row : arr) {
			for (int col : row) {
				System.out.print(col + " ");
			}
		}
		sc.close();
	}
}
