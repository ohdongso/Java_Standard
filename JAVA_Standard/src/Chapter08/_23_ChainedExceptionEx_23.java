package Chapter08;

public class _23_ChainedExceptionEx_23 {

	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException11 e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main메서드의 끝
	
	static void install() throws InstallException11 {
		try {
			startInstall(); // 프로그램 설치에 필요한 준비를 한다.
			copyFiles(); // 파일들을 복사한다.
		} catch (SpaceException11 se) {
			InstallException11 ie = new InstallException11("설치 중 예외발생");
			ie.initCause(se);
			throw ie;
		} catch (MemoryException11 me) {
			InstallException11 ie = new InstallException11("설치 중 예외발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles(); // 프로그램 설치에 사용된 임시파일들을 삭제한다.
		} // try의 끝
	}
	
	static void startInstall() throws SpaceException11, MemoryException11 {
		if(!enoughSpace()) {
			throw new SpaceException11("설치할 공간이 북족합니다.");
		}
	}
	
	static void copyFiles() { /* 파일들을 복사하는 코드를 적는다. */ }
	static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다. */ }
	
	static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
		return false;
	}
	
	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
		return true;
	}
	
} // ExceptionTest클래스의 끝

class InstallException11 extends Exception {
	InstallException11(String msg) {
		super(msg);
	}
}

class SpaceException11 extends Exception {
	SpaceException11(String msg) {
		super(msg);
	}
}

class MemoryException11 extends Exception {
	MemoryException11(String msg) {
		super(msg);
	}
}


