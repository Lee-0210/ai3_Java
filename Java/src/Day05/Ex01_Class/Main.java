package Day05.Ex01_Class;

public class Main {

	public static void main(String[] args) {
		// 객체 생성
		// 클래스타입 객체명 = new 클래스명();
		Person person = new Person();
		
		// (.) : 접근 연산자
		person.name = "이준영";
		person.age = 28;
		
		System.out.println("이름 : " + person.name);
		System.out.println("나이 : " + person.age);
		person.eat("보끔당");
		person.work("코딩", 12);
	}
}
