package Chapter12;

enum Direction1 {
	EAST(1, ">"), SOUTH2(2, "V"), WEST(3, "<"), NORTH(4, "^");
	
	private static final Direction1[] DIR_ARR = Direction1.values();
	private final int value;
	private final String symbol;
	
	Direction1(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() { return value; }
	public String getSymbol() { return symbol; }
	
	public static Direction1 of(int dir) {
		if(dir < 1 || dir > 4) {
			throw new IllegalArgumentException("Invalid value :" + dir);
		}
		return DIR_ARR[dir - 1];
	}
	
	// 방향을 ==> 여기서 부터
}

public class _06_EnumEx2 {
	
	public static void main(String[] args) {
		
		
		
	} // main
}