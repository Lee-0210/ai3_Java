package Day05.Ex03_Method;

public class CarTest {

	public static void main(String[] args) {
		// 객체 생성
		Car car = new Car();
		// private 으로 지정한 외부에서 접근 불가
//		car.model = "제네시스";
//		car.speed = 130;
		
		car.setModel("제네시스");
		car.setSpeed(400);
		
		System.out.println("model : " + car.getModel());
		System.out.println("speed : " + car.getSpeed());
	}
}
