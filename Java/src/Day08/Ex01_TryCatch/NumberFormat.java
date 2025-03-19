package Day08.Ex01_TryCatch;

// 예외 처리
// NumberFormatException
// : 문자열 숫자("10")가 아닌 문자열을 숫자 타입으로 변환 시 발생하는 예외 상황
// ex) "10A" --> 숫자로 변환하면 예외
// 	   "10   --> 10
public class NumberFormat {
	
	public static void main(String[] args) {
		String startNum = "10";
		int num = 10;
		
		System.out.println("10 + 20 = " + (startNum + 20));	// 1020
		System.out.println("10 + 20 = " + (num + 20));		// 30
		
		String numberString = "10";
		String numberAndString = "A10";
		// Integer.parseInt("문자열숫자")
		// : 문자열 숫자를 int 타입의 숫자로 변환하는 메서드
		int num1 = Integer.parseInt(numberString); // "10" -> 10
		System.out.println("numberString + 5 = " + (numberString + 5)); // 105
		
		int num2 = 0;
		// 예외 메시지 : Exception in thread "main" java.lang.NumberFormatException
		// 예외 상황	: 문자열 숫자가 아닌 문자열을 숫자로 변환할 수 없기 때문에
		try {
			num2 = Integer.parseInt(numberAndString);
		} catch (NumberFormatException e) {
			System.err.println("문자열숫자가 아닌 문자열을 숫자타입으로 변환 불가");
		}
		
		
		System.out.println("num1 + 10 = " + (num1 + 10)); // 20
		System.out.println("num2 : " + num2); // 
	}
}
