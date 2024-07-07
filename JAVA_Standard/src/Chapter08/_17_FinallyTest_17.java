package Chapter08;

public class _17_FinallyTest_17 {
		/*
		  	finally블럭은 try-catch문과 함께 예외의 발생여부에 상관없이 
		  	실행되어야할 코드를 포함시킬 목적으로 사용된다.
		 */
	public static void main(String[] args) {
		try {
			startInstall(); // 프로그램 설치에 필요한 준비를 한다.
			copyFiles(); // 파일들을 복사한다.
			deleteTempFiles(); // 프로그램 설치에 사용된 임시파일들을 삭제한다.
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles(); // 프로그램 설치에 사용된 임시파일들을 삭제한다.
		} // try-catch의 끝
		
	} // main메서드의 끝
	
	static void startInstall() {
		/* 프로그램 설치에 필요한 준비를 하는 코드를 적는다. */
	}
	
	static void copyFiles() {
		/* 파일들을 복사하는 코드를 적는다. */
	}
	
	static void deleteTempFiles() {
		/* 임시파일들을 삭제하는 코드를 적는다. */
	}
	
} // 클래스의 끝