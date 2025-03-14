package Day05.Ex02_Constructor;

// 학생
// - 변수		: 이름, 나이, 학번, 전공
// - 메소드	: 공부하기, 성적 평균 구하기

public class Student {
	
	// 변수
	String name;
	int age;
	String stdNo;
	String major;
	
	// 기본 생성자
	public Student() {
		this("이름없음", 0, "00000000", "전공없음");
	}
	
	public Student(String name) {
		this(name, 0, "00000000", "전공없음");
	}

	// 파라미터가 있는 생성자
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}

	// 메소드
	// * 접근지정자 반환타입 메소드명(파라미터) {  }
	// - 공부하기
	// * void : 반환타입 없음 (return 생략가능)
	// - void 로 지정해도 return 을 메서드를 종료시키는 용도로 사용할 수 있다.
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
	}
	
	public double getAverage(int score1, int score2) {
		double avg = (score1 + score2) / 2.0;
		
		return avg;
	}
	
	public double getAverage(int score1, int score2, int score3) {
		double avg = (score1 + score2 + score3) / 2.0;
		
		return avg;
	}
	
}
