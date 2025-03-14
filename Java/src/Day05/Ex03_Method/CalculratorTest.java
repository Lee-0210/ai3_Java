package Day05.Ex03_Method;

import java.util.Scanner;

public class CalculratorTest {

	public static void main(String[] args) {
		// 계산기 객체 생성
		Calculator cal = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a : " );
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		int[] arr = {a, b, 3, 4, 5};
		
		int result1 = cal.plus(a, b);
		System.out.println("a + b : " + result1);
		
		int result2 = cal.minus(a, b);
		System.out.println("a - b : " + result2);
		
		double result3 = cal.multiple(a, b);
		System.out.println("a * b : " + result3);
		
		double result4 = cal.divde(a, b);
		System.out.println("a / b : " + result4);
		
		int result5 = cal.remain(a, b);
		System.out.println("a % b : " + result5);
		
		
		
		int result6 = cal.sum(arr);
		System.out.println("arr의 합계 : " + result6);
		
		double result7 = cal.avg(arr);
		System.out.println("arr의 평균 : " + result7);
	
		sc.close();
	}
}
