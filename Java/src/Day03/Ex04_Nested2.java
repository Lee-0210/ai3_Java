package Day03;

import java.util.Scanner;

public class Ex04_Nested2 {

	public static void main(String[] args) {
		// 정보처리기사 합격 기준
		// * 응시자격	: 대학교 4학년
		// * 점수		: 60점 이상
		Scanner sc = new Scanner(System.in);
		System.out.print("학년 : ");
		int year = sc.nextInt();

		if(year != 4) {
			System.out.println("응시 자격이 없습니다.");
			return;
		} 
		
		System.out.print("점수 : ");
	    int score = sc.nextInt();
		
		if(score >= 60) System.out.println("합격!");
		else System.out.println("불합격!");
		
		sc.close();
	}
}
