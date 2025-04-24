package Chapter12;

abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T> {
	static int id = 0;
	int ordinal;
	String name = "";
	
	public int ordinal() { return ordinal; } 
	
	MyEnum(String name) {
		this.name = name;
		ordinal = id++;
	}
	
	public int compareTo(T t) {
		return ordinal - t.ordinal();
	}
}

// ==> 여기서 부터

public class _08_EnumEx4 {
	
	public static void main(String[] args) {
		
		
		
	}
}