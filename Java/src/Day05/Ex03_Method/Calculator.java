package Day05.Ex03_Method;

/*
 * 계산기
 * 
 * - 피연산자를 2개로 하는 계산기
 * - 기능
 * 		1. 덧셈	: 정수 2개를 덧셈
 * 		2. 뺄셈	: 정수 인자1 - 인자2 연산을 하는 뺄셈
 * 		3. 곱셈	: 실수 2개를 곱셈
 * 		4. 나눗셈 : 실수 인자1 / 인자2 연산을 하는 나눗셈
 * 		5. 나머지	: 정수 인자1 % 인자2 연산을 하는 나눗셈
 * 		6. 합계	: 배열로 매개변수를 전달받아, 모둔 요소의 합계를 구함
 * 		7. 평균	: 베열로 매개변수를 전달받아, 모든 요소의 평균을 구함
 * 
 * 		* 메소드명
 * 		: plus, minus, multiple, divde, remain, sum, avg
 */
		
public class Calculator {
	
	public int plus(int a, int b) {
		int plus = a + b;
		
		return plus;
	}
	
	public int minus(int a, int b) {
		int minus = a - b;
		
		return minus;
	}
	
	public double multiple(double a, double b) {
		double multiple = a * b;
		
		return multiple;
	}
	
	public double divde(double a, double b) {
		double divde = a / b;
		
		return divde;
	}
	
	public int remain(int a, int b) {
		int remain = a % b;
		
		return remain;
	}
	
	public int sum(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum;
	}
	
	public double avg(int[] array) {
		int sum = sum(array);
		double avg = sum / (double)array.length;
		
		return avg;
	}
}
