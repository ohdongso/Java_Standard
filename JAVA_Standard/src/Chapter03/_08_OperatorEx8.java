package Chapter03;

public class _08_OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000; // 1,000,000 1배만
		int b = 2_000_000; // 2,000,000 2백만
		
		long  c = a * b; // a * b = 2,000,000,000,000 ?
		System.out.println(c);
	}
}