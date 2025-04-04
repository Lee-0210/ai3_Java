package Day13.Ex02_Stream;

import java.util.Scanner;

public class LottoArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임 : ");
		int N = sc.nextInt();
		int lotto[] = new int[6];
		
		for(int i = 0; i < N; i++) {
			System.out.print("[" + (i+1) + "게임] : ");
			
			for(int j = 0; j < lotto.length; j++) {
				int rand = (int)(Math.random() * 45) + 1;
				lotto[j] = rand;
				
				for(int k = 0; k < j; k++) {
					if(rand == lotto[k]) {
						j--;
						break;
					}
				}
			}
			
			// 정렬 - 버블 정렬
			for(int j = 0; j < lotto.length; j++) {
				for(int k = 0; k < lotto.length-j-1; k++) {
					if(lotto[k] > lotto[k+1]) {
						int temp = lotto[k];
						lotto[k] = lotto[k+1];
						lotto[k+1] = temp;
					}
				}
			}
			
			// 출력
			for(int j = 0; j < lotto.length; j++) {
				System.out.print(lotto[j] + " ");
			}
			System.out.println();
		} // - 랜덤 수 6개 대입
		
		sc.close();
	}
}
