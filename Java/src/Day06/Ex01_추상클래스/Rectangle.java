package Day06.Ex01_추상클래스;

public class Rectangle extends Shape {
	// 필드 변수
	double width, height;
	
	// 기본 생성자
	public Rectangle() {
		this(0, 0);
	}
	
	// 매개변수 생성자
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	@Override
	double area() {
		return width * height;
	}

	@Override
	double round() {
		return (width + height) * 2;
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
	
	// toString()
	@Override
	public String toString() {
		return "Rectanlge [width=" + width + ", height=" + height + "]";
	}
}
