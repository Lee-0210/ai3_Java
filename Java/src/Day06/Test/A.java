package Day06.Test;

public class A {
	
	int a = 1;
	static int b = 2;
	
	class B {
		int a = 1;
		static int b = 2;
		
		B() {
			System.out.println("B객체 생성");
		}
		
		public void method1() {
			System.out.println("B의 인스턴스 메서드");
		}
		
		public static void method2() {
			System.out.println("B의 스태틱 메서드");
		}
	}
	
	static class C {
		int a = 1;
		static int b = 2;
		
		public void method1() {
			System.out.println("C의 인스턴스 메서드");
		}
		
		public static void method2() {
			System.out.println("C의 스태틱 메서드");
		}
	}
}
