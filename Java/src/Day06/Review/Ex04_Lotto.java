package Day06.Review;

public class Ex04_Lotto {

	public static void main(String[] args) {
		// Math.random() : 0.xxxx ~ 0.9xxxx 사이의 난수를 반환하는 메서드
		double random = Math.random();
		System.out.println(random);
		
		// 1~6 사이의 정수 : 주사위
		// (int)(Math.random() * 10) + 1	: 1 ~ 10 정수
		System.out.print("1 ~ 10 : ");
		System.out.println((int)(Math.random()* 10) + 1);
		
		// (int)(Math.random() * 6) + 1		: 1 ~ 6 정수
		System.out.print("1 ~ 6 : ");
		System.out.println((int)(Math.random() * 6) + 1);
		
		// 1 ~ 45 사이의 랜덤수 배열에 담기
		int[] lotto = new int[6];
		
		// 중복제거
		// (과제) 오름차순 정렬
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			
			for(int j = i-1; j >= 0; j--) {
				// 중복
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		// -20 ~ 20 사이의 랜덤수
		System.out.print("-20 ~ 20 : ");
		System.out.println((int)(Math.random() * 41) - 20);
		
		// 1 ~ 20 사이의 랜덤수
		System.out.print("1 ~ 20 : ");
		System.out.println((int)(Math.random() * 20) + 1);
		
	}
}
