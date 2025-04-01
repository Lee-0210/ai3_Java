package Day14.Serialization;

import java.io.Serializable;

// 직렬화
// * Serializable 인터페이스를 구현해야 직렬화 객체를 정의할 수 있다.
public class Person implements Serializable{
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = -1161408428945099645L;
	private static final long serialVersionUID = 321L;
	
	private String name;
	private int age;
	// 변수를 추가하면 에러
//	private String address;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
