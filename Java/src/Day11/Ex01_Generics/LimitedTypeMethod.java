package Day11.Ex01_Generics;

import java.util.HashSet;

public class LimitedTypeMethod {
	
	public <T extends Number> void method(T t) {
		System.out.println(t.intValue());
		System.out.println(t.doubleValue());
	}
	
	public static void main(String[] args) {
		LimitedTypeMethod ltm = new LimitedTypeMethod();
		ltm.<Integer>method(1234);
		ltm.<Double>method(12.34);

		// (에러)
		// 문자열은 Number 클래스의 자식 클래스가 아니므로 에러 발생
		// ltm.<String>method("12.34");
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(6);
		hs.add(2);
		hs.add(3);
		hs.add(5);
		hs.clear();
		System.out.println(hs.size());
	}
}
