package Day11.Ex01_Generics;

import Day05.Ex04_Inheritance.Pikachu;

public class BoxEx {

	public static void main(String[] args) {
		// 제네릭
		// - 구조	: class 클래스명<타입매개변수1, 타입매개변수2> { }
		// - 예시	: class Box <T> { }
		// - 생성	: Box<클래스> box = new Box<타입>();
		
		Box<?> box;
		box = new Box<String>();
		box = new Box<Boolean>();
		box = new Box<Integer>();
		
		Box<String> box1 = new Box<>();
		box1.setT("물");
		String boxName = box1.getT();
		System.out.println("box1 : " + boxName);
		
		Box<Pikachu> monsterBall = new Box<>();
		monsterBall.setT(new Pikachu(100, "전기"));
		Pikachu pikachu = monsterBall.getT();
		System.out.println("pikachu : " + pikachu);
		
		Box<Integer> numberBox = new Box<>();
		numberBox.setT(100);
		System.out.println("numberBox : " + numberBox.getT());
		
		Box<int[]> snackBox = new Box<>();
		snackBox.setT(new int[] {1,2,3,4,5});
		int[] snackArr = snackBox.getT();
		for (int i : snackArr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
