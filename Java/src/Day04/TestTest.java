package Day04;

public class TestTest {

	public static void main(String[] args) {
		Rainbow[] rain = Rainbow.values();
		for (int i = 0; i < rain.length; i++) {
			System.out.println(rain[i].getColor());
		}
	}
}
