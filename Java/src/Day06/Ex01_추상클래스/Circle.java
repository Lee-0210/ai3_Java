package Day06.Ex01_추상클래스;

public class Circle extends Shape {
	// 필드 변수
	double radius;
	
	// 기본 생성자
	public Circle() {
		this(0.0);
	}
	
	// 매개변수 생성자
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.pow(radius, 2) * Math.PI;
	}

	@Override
	double round() {
		return 2 * Math.PI * radius;
	}
	
	// getter, setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// toString()
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
