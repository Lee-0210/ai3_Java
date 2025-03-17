package Day06.Test;

import Day06.Test.A.B;

public class D {

	public static void main(String[] args) {
		A a = new A();
		
		A.B = a.new B();
	}

}
