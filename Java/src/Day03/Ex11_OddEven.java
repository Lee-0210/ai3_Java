package Day03;

public class Ex11_OddEven {

	public static void main(String[] args) {
		// 1 ~ 20 까지 정수 중,
		// 홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오.
		
		// 순서도
		// 1. 1 ~ 20까지 반복
		// 2. 홀수인지 짝수인지 판별
		// 3. 홀수합계
		// 4. 짝수합계
		
		int i = 1;
		int odd = 0;
		int even = 0;
		
		while(i <= 20) {

			if(i % 2 != 0) 
				odd += i++;
			else 
				even += i++;
		}
		
		System.out.println("홀수의 합계 : " + odd);
		System.out.println("짝수의 합계 : " + even);
	}
}
