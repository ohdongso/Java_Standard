package Chapter07;

/*
 	익명 클래스에 대해서 알아보도록 하자. 익명 클래스는 특이하게도 다른 내부 클래스들과는 달리 이름이 없다.
 	클래스의 선언과 객체의 생성을 동시에 하기 때문에 단 한번만 사용될 수 있고 오직 하나의 객체만을 생성할 수 있는 일회용 클래스이다.
 	
 	아래의 예제는 단순히 익명 클래스의 사용 예를 보여 준 것이다. 이 예제를 컴파일 하면 다음과 같이 4개의 클래스파일이 생성된다.
 	_36_InnerEx6
 	_36_InnerEx6$1.class <- 익명 클래스
 	_36_InnerEx6$2.class <- 익명 클래스
 	_36_InnerEx6$.class <- 익명 클래스
 	
 	익명 클래스는 이름이 없기 때문에 '외부 클래스명$숫자.class'의 형식으로 클래스파일명이 결정된다.
 */

public class _36_InnerEx6 {
	
	Object iv = new Object() { void method() {}}; // 익명 클래스
	static Object cv = new Object() { void method() {}}; // 익명 클래스
			
	void myMethod() {
		Object iv = new Object() { void method() {}}; // 익명 클래스
	}
	
}