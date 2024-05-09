package Chapter07;

public class _03_DeckTest {
	
	public static void main(String[] args) {
		// 4종류 13장씩 총 "52"장의 카드객체가 배열에 저장된다.
		Deck d = new Deck(); // 카드 한 벌(Deck)을 만든다.
		
		// 카드배열에서 index "0"에 해당하는 Card객체를 뽑는다.
		Card c = d.pick(0); // 섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(c); // System.out.println(c.toString());과 같다.
		
		// i(0~51)에 해당하는 카드를 난수(r(0~51))로 섞는다.
		d.shuffle(); // 카드를 섞는다.
		c = d.pick(); // 섞은 후에 제일 위의 카드를 뽑는다.
		System.out.println(c);
	} // main 끝.
} // _03_DeckTest 끝.

class Deck {
	final int CARD_NUM = 52; // 카드의 개수
	Card cardArr[] = new Card[CARD_NUM]; // Card객체 배열을 포함
	
	Deck() { // Deck의 카드를 초기화한다.
		int i = 0;
		
		for(int k = Card.KIND_MAX; k > 0; k--) { // 4,3,2,1
			for(int n = 0; n < Card.NUM_MAX; n++) { // 0 ~ 12
				cardArr[i++] = new Card(k, n + 1); // 4종류 13장씩 총 "52"장의 카드객체가 배열에 저장된다.
			}
		}
	} // Deck 기본생성자 끝.
	
	Card pick(int index) { // 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
		return cardArr[index];
	}
	
	Card pick() { // Deck에서 카드 하나를 선택한다. ==> 반환타입이 Card다.
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	void shuffle() { // 카드의 순서를 섞는다.
		for(int i = 0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM); // 0~51 난수 생성.
			
			Card temp = cardArr[i]; // i index에 해당하는 Card객체를 temp 변수에 담고
			cardArr[i] = cardArr[r]; // i index에는 r index에 해당하는 Card객체를 담고
			cardArr[r] = temp; // r index에는 i index에 해당하는 객체를 저장한다.
		}
	}
	
} // Deck 끝.

class Card {
	static final int KIND_MAX = 4; // 카드 무늬의 수
	static final int NUM_MAX = 13; // 무늬별 카드 수
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;
	int number;
	
	Card() { // 기본생성자를 호출하면, 매개변수 2개인 생성자 호출
		this(SPADE, 1);
	}
	
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK"; // 숫자 10은 X로 표현
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	} // toString()의 끝.
} // Card 끝.
