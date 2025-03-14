package Day05.Ex02_Constructor;

public class Main {

	public static void main(String[] args) {
		// Student 객체 생성
		Student std1 = new Student();
		
		std1.name = "일이삼";
		std1.age = 20;
		std1.stdNo = "20250314";
		std1.major = "컴퓨터공학";
		
		System.out.println("::::::::: 학생1 :::::::::::");
		System.out.println("학생1 - 이름 : " + std1.name);
		System.out.println("학생1 - 나이 : " + std1.age);
		System.out.println("학생1 - 전공 : " + std1.major);
		System.out.println("학생1 - 학번 : " + std1.stdNo);
		std1.study("임베디드 시스템");
		System.out.println("점수의 평균 : " + std1.getAverage(80, 95));
		
		Student std2 = new Student("이준영", 28, "20190000", "체육교육과");
		
		System.out.println("::::::::: 학생2 :::::::::::");
		System.out.println("학생2 - 이름 : " + std2.name);
		System.out.println("학생2 - 나이 : " + std2.age);
		System.out.println("학생2 - 전공 : " + std2.major);
		System.out.println("학생2 - 학번 : " + std2.stdNo);
		std2.study("축구");
		System.out.println("점수의 평균 : " + std2.getAverage(80, 95));
		
		Student std3 = new Student("윤홍민");
		
		System.out.println("::::::::: 학생3 :::::::::::");
		System.out.println("학생3 - 이름 : " + std3.name);
		System.out.println("학생3 - 나이 : " + std3.age);
		System.out.println("학생3 - 전공 : " + std3.major);
		System.out.println("학생3 - 학번 : " + std3.stdNo);
		std3.study("축구");
		System.out.println("점수의 평균 : " + std3.getAverage(80, 95));
	}
}
