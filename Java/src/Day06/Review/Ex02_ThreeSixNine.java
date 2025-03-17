package Day06.Review;

public class Ex02_ThreeSixNine {

	public static void main(String[] args) {
		// 정수가 1 ~ 100 까지 수를 반복하여 출력하면서,
		// 해당 수가 3또는 6 또는 9가 될 때는
		// 자리수마다 369가 되는 개수 만큼 정수 대신
		// "*"을 출력하는 프로그램을 작성하시오.
		// ex)
		// 13 : *
		// 66 : *
		
		// 순서도
		// 1. 정수 1~100 까지 출력
		// 2. 해당 수의 369가 몇 개인지 판단
		// 	2-1 십의 자리수가 369인지 여부 판단 (A)
		// 	2-2 십의 자리수가 369인지 여부 판단 (B)
		// 3. 369 개수의 따라 출력
		// 	A and B --> **
		//  A or B --> *
		// 그 외 --> 정수
		
		System.out.println("::::: 정수로 비교 :::::::");
		// 그냥 정수로 해보기
		for(int i = 1; i <= 100; i++) {
			int ten = i / 10;
			int one = i % 10;
			
			if(ten % 3 == 0 && ten > 0) System.out.print("*");
			else if(ten > 0) System.out.print(ten);
			else System.out.print("");
			
			if(one % 3 == 0) {
				System.out.print("*");
			} else {
				System.out.print(one);
			}
			
			System.out.println();
		}
		
		System.out.println(":::::: 문자열 비교 :::::::");
		// 정수를 문자열로 바꿔서 비교하는 방법
		for (int i = 1; i <= 100; i++) {
			String str = String.valueOf(i);
			for(char ch : str.toCharArray()) {
				if(ch =='3' || ch == '6' || ch == '9') {
					System.out.print("*");
				} else {
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}
}
