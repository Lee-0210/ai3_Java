package Day08.Ex01_TryCatch;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// try : ctrl + space
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		try {
			int result = a/b;
			System.out.println("result : " + result);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("예외 발생");
			System.err.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("예외 처리 완료");
		}
		
		try {
			int c = sc.nextInt();
		} catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
