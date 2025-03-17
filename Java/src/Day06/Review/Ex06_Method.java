package Day06.Review;

import java.util.Scanner;

public class Ex06_Method {
	
	/**
	 * 덧셈 메서드
	 * @author tj-bu-706-02
	 * @param a : 첫 번째 피연산자
	 * @param b : 두 번째 피연산자
	 * @return	: 덧셈한 결과
	 */
	public static int plus(int a, int b) {
		int result = a + b;
		
		return result;
	}
	
	// 메서드 정의
	// : 접근제어자 (static) 반환타입 메서드명(매개변수) { } 
	
	public static int minus(int a, int b) {
		if(a < 0 || b < 0) return 0;
		int result = a - b;
		// 1. (값)을 메서드를 호출한 자리로 반환
		// 2. 메서드 종료
		// 3. 메모리 해제
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		// 메서드 호출 : 메서드명(인자1, 인자2)
		// - 전달인자(argument)
		System.out.println(plus(a, b));
		System.out.println(minus(a, b));
		
		sc.close();
	}
}
