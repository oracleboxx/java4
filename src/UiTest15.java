import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* 익명클래스(내부 무명 클래스: 외부클래스명$번호.class) 문법으로 이벤트 처리
 * 
 * 
 */
class MyFrame15 extends JFrame{
	private JButton button;
	private JLabel label;
	public MyFrame15() {
		setTitle("익명클래스 문법으로 이벤트 처리");
		setSize(600,400);
		setVisible(true);

		JPanel panel =new JPanel();
		button = new JButton("버튼을 누르세요");
		label = new JLabel("아직 버튼을 누르지않았습니다");
		
		panel.add(button); panel.add(label);
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button) {
					label.setText("버튼이 클릭되었습니다");
				}
			}
		});
	}
}


public class UiTest15 {

	public static void main(String[] args) {
		new MyFrame15();
	}

}
