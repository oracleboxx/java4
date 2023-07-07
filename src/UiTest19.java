import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* ImageIcon 컴포넌트를 활용해서 스윙 컴포넌트에 이미지 표시하기
 * 
 */

public class UiTest19 extends JFrame implements ActionListener {
 private JPanel panel; // 패널을 각 컴포넌트를 그룹화 시켜서 레이아웃 기능을 하는 컨테이너이다.
 private JLabel label;
 private JButton button;
	public UiTest19() {
		setTitle("스윙에 그림배치 연습");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		label = new JLabel("이미지를 보려면 아래 버튼을 클릭하세요");
		button =new JButton("이미지 레이블");
		ImageIcon icon = new ImageIcon("./images/icon.jpg");
		//스윙 컴포넌트에 이미지를 표시할려면 ImageIcon객체를 사용한다.
		button.setIcon(icon);
		button.addActionListener(this);
		panel.add(label); // 패널에 라벨과 버튼 추가
		panel.add(button);
		add(panel);// 스윙 프레임윈도우에 패널추가
		setVisible(true);//항상 보이게하기
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ImageIcon dogIcon = new ImageIcon("./images/dog.jpg");
		label.setIcon(dogIcon);//라벨에 이미지 배치
		label.setText(null);//라벨위 문자를 지운다
	}

	public static void main(String[] args) {
		new UiTest19();//생성자 호출
	}

}
