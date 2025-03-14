package Day04;

public enum Rainbow {
	
	RED("빨강"),
	ORANGE("주황"),
	YELLOW("노랑"),
	GREEN("초록"), 
	BLUE("파랑"), 
	NAVY("남색"), 
	PURPLE("보라");
	
	private final String color;
	
	Rainbow(String string) {
		this.color = string;
	}
	public String getColor() {
		return color;
	}
}
