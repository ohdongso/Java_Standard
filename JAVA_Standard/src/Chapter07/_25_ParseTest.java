package Chapter07;

/*
	Parseable인터페이스는 구문분석을 수행하는 기능을 구현할 목적으로 추상메서드 'parse(String fileName)'을 정의했다.
	그리고 XMLParser클래스와 HTMLParser클래스는 Parseable인터페이스를 구현하였다.
	ParserManager클래스의 getParser메서드는 매개변수로 넘겨받는 type의 값에 따라 XMLParser인스턴스 또는 HTMLParser인스턴스를 반환한다.
	
	인터페이스 클래스 타입에 상속받은 클래스의 객체를 넣어서 메서드를 호출하면
	업캐스팅 되더라도 오버라이딩된 자식 메서드가 호출된다.
 */

interface _25_Parseable {
	// 구문 분석작업을 수행한다.
	public abstract void parse(String fileName);
}

class ParserManager {
	// 리턴타입이 Parseable인터페이스이다.
	public static _25_Parseable getParse(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			_25_Parseable p = new HTMLParser();
			return p;
			// return new HTMLParser();
		}
	}
}

class XMLParser implements _25_Parseable {

	@Override
	public void parse(String fileName) {
		/* 구문 분석작업을 수행하는 코드를 적는다. */	
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser implements _25_Parseable {

	@Override
	public void parse(String fileName) {
		/* 구문 분석작업을 수행하는 코드를 적는다. */
		System.out.println(fileName + "- HTML parsing completed.");
	}	
}

public class _25_ParseTest {

	public static void main(String[] args) {
		_25_Parseable parser = ParserManager.getParse("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParse("HTML");
		parser.parse("document2.html");
	}
}