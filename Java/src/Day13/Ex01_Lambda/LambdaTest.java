package Day13.Ex01_Lambda;

/*
 * 익명 객체
 * - 익명 자식 객체
 * - 익명 구현 객체
 * 
 * 익명 함수
 */

// 익명 자식 객체의 부모 클래스 정의
class Television {
	void volumnUp() {
		System.out.println("UP");
	}
	void volumnDown() {
		System.out.println("Down");
	}
}

// 익명 구현 객체의 인터페이스 정의
interface RemoteControl {
	void volumeUp();
	void volumeDown();
}

// 익명 함수를 위한 함수형 인터페이스 정의
@FunctionalInterface
interface Calculator {
	int calc(int a, int b);
}

public class LambdaTest {
	
	public static void main(String[] args) {
		// 익명 자식 객체
		Television tv = new Television() {

			@Override
			void volumnUp() {
				System.out.println("익명 자식 객체 UP");
			}

			@Override
			void volumnDown() {
				System.out.println("익명 자식 객체 DOWN");
			}
		};
		tv.volumnUp();
		tv.volumnDown();
		
		// 익명 구현 객체
		RemoteControl rc = new RemoteControl() {

			@Override
			public void volumeUp() {
				System.out.println("익명 구현 객체 UP");
			}

			@Override
			public void volumeDown() {
				System.out.println("익명 구현 객체 DOWN");
			}
		};
		rc.volumeUp();
		rc.volumeDown();
		
		// 익명 구현 객체2
		Calculator cal0 = new Calculator() {
			@Override
			public int calc(int a, int b) {
				return a + b;
			}
		};
		System.out.println("익명 구현 객체2 : " + cal0.calc(5, 10));
		
		// 익명 함수
		Calculator cal = (a, b) -> a + b;
		System.out.println("익명 함수 : " + cal.calc(5, 10));
	}
}
