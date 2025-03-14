package Day05.Ex04_Inheritance;

// 상속
// - 키워드 : 자식클래스 extends 부모클래스
public class Raichu extends Pikachu {

	// 부모 클래스의 생성자를 따라서 생성자 자동완성
	// : alt + shift + S : C
	
	public Raichu() {
		super(300, "메가전기");
	}

	public Raichu(int energy, String type) {
		super(energy, "메가전기");
	}

	public Raichu(int energy) {
		super(energy);
	}
	
	// 메소드 오버라이딩
	// : 부모 클래스의 메소드를 자식클래스에서 재정의
	
	@Override // 어노테이션 : 코드에 특별한 기능 또는 설명을 추가하는 방법
	public String aAttack() {
		return "백만볼트";
	}
	
	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	
	public String cAttack() {
		return "아이언테일";
	}
	
}
