package Day13.Ex02_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LottoArrayList {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			List<Integer> lotto = new ArrayList<>();
			
			for(int j = 0; j < 6; j++) {
				int rand = (int)(Math.random() * 46) + 1;
				
				if(lotto.contains(rand)) j--;
				else lotto.add(rand);
			}
			
			Collections.sort(lotto);
			
			System.out.print("[" + (i+1) + "게임] ");
			for(int j = 0; j < 6; j++) {
				System.out.print(lotto.get(j) + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
