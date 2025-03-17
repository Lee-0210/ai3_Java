package Day06.Ex01_추상클래스;

public class Triangle extends Shape {
	// 필드 변수
	double width, height;
	
	// 기본 생성자
	public Triangle() {
		this(0.0, 0.0);
	}
	
	// 매개변수 생성자
	public Triangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	@Override
	double area() {
		return width * height / 2;
	}

	@Override
	double round() {
		// *정삼각형
		return 3 * width;
	}

	// getter, setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// toString()S
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	
}
