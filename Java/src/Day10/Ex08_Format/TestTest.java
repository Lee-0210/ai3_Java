package Day10.Ex08_Format;

import java.util.Scanner;

public class TestTest {
	
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		
		// 왼쪽 아래 삼각형 
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 오른쪽 삼각형
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for(int j = n; j > i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
			
		System.out.println();
		
		// 왼쪽 위 삼각형
		for(int i = 0; i < n; i++) {
			for(int j = n; j > i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		// 오른쪽 아래 삼각형
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < n-i-1; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		// 정삼각형
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < n-i-1; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i+1)+(i+1)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		System.out.println();
		
		// 다이아몬드
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < n-i-1; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i+1)+(i+1)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	

		for(int i = 0; i < n; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for(int j = i+i+1; j <= n+n-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
	}
}
