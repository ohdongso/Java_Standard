package Chapter07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
	먼저 두 개의 독립된 클래스를 작성한 다음에, 
	다시 익명클래스를 이용하여 변경하면 보다 쉽게 코드를 작성 수 있을 것이다.
 */

public class _38_InnerEx8 {
	
	public static void main(String[] args) {
		Button b = new Button("Start");
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("ActionEvent occurred!!!");
				}
			} // 익명 클래스의 끝 
		);
	} // main의 끝
} // InnerEx8의 끝