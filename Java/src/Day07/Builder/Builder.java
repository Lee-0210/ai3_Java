package Day07.Builder;

public class Builder {
	
	public static void main(String[] args) {
		
		// 체이닝으로 유연하게 객체 생성이 가능해짐
		Pikachu pikachu = new Pikachu.Builder()
									 .energy(100)
									 .type("전기")
									 .level(15)
									 .build();
		
		System.out.println(pikachu);
		
		Pikachu pikachu2 = new Pikachu.Builder()
									  .energy(100)
									  .level(15)
									  .build();
		
		System.out.println(pikachu2);
	}
}
