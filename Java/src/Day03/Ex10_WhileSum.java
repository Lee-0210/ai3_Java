package Day03;

public class Ex10_WhileSum {
	
	public static void main(String[] args) {
		// 1부터 1000까지 합계를 구하시오.
		
		int i = 1;
		int sum = 0;
		
		while(i <= 1000) {
			sum += i++;
		}
		
		System.out.println(sum);
	}
}
