package Day08.test;

class A <T> {
	private T item;
	
	A(T item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "A [item=" + item + "]";
	}
	
}

public class Test {
	
	public static void main(String[] args) {
		A<String> stringClass = new A<>("안녕");
		A<Integer> intClass = new A<>(123);
		System.out.println(stringClass);
		System.out.println(intClass);
	}
	
	
}
