package Day06.Review;

import java.util.Scanner;

/*
 * 우리학원에서 고건우님께서 거액의 예산을 주고
 * 전자렌지를 구매하라고 지시하였다.
 * 이 때 전자렌지 구매비는 다음과 같이 현금으로 지급한다.
 * 구매비용	: 657862
 * 50000	: 13개
 * 10000	: 0개
 * 5000		: 1개
 * 1000		: 2개
 * 500		: 1개
 * 100		: 3개
 * 50		: 1개
 * 10		: 1개
 * 5		: 0개
 * 1		: 2개
 * 
 * 위와같이 입력하면,
 * 큰 화폐단위부터 계산하여, 화폐단위별로 화폐매수를 출력하는 프로그램을 작성하시오.
 */
public class Ex03_화폐매수 {
	
	public static void main(String[] args) {
		
		
		
		// 순서도
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int[] count = new int[10];
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		// 화폐의 개수 담기
		for(int i = 0; i < money.length; i++) {
			count[i] = price / money[i];
			price = price % money[i];
		}
		
		// 각 화폐의 개수 출력하기
		for(int i = 0; i < count.length; i++) {
			System.out.println(money[i] + " : " + count[i] + "개");
		}
		
		sc.close();
	}
}
