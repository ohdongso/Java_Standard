package Chapter06;

class Document {
	static int count = 0; // 클래스 변수
	String name; // 문서명(Document name)
	
	Document() { // 문서 생성 시 문서명을 지정하지 않았을 때
		this("제목없음" + ++count);
	}
	
	Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}

public class _30_DocumentTest {
	
	public static void main(String[] args) {
		Document d1 = new Document(); // name에는 "제목없음", count+1
		Document d2 = new Document("자바.txt"); // name에는 "자바.txt"가 저장된다.
		Document d3 = new Document(); // name에는 "제목없음", count+2
		Document d4 = new Document(); // name에는 "제목없음", count+3
	}
	
}