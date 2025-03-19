package Day08.test;

import java.util.ArrayList;
import java.util.List;

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
		
		ArrayList<Integer> array = new ArrayList<>();
		List<Integer> arr = new ArrayList<>();
		for(int i = 9; i >= 0; i--) {
			array.add(i);
		}
		for(int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
		array.sort(null);
		System.out.println(array.toString());
		array.sort((a, b) -> b - a);
		System.out.println(array.toString());
	}
}
