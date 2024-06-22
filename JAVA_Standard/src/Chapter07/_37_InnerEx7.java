package Chapter07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
	이 예제를 실행하면 아무것도 화면에 나타나지 않은 채 종료된다.
	단지 익명클래스로 변환하는 예를 보여주기 위한 것일 뿐이다.
 */

public class _37_InnerEx7 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
	}
}

class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}
