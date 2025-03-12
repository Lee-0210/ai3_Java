package Day03;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {
		// 정보처리기사 합격 기준
		// * 응시자격	: 대학교 4학년
		// * 점수		: 60점 이상
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년 : ");
		int year = sc.nextInt();
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		// 중첩 if문은 가독성이 떨어져서 권장X
		if(year < 4) System.out.println("응시 자격이 없습니다.");
		else 
			if(score < 60) System.out.println("불합격!");
			else System.out.println("합격!");
		
		System.out.println("---------------------------");
		
		// 조건문 (if)문 중첩하지 않고 조건을 작성할 수 있다.
		if(year != 4) System.out.println("응시 자격이 없습니다.");
		else if(score >= 60) System.out.println("합격!");
		else System.out.println("불합격!");
	}
}
