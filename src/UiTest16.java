import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame16 extends JFrame{
	private JButton button;
	private JLabel label;
	public MyFrame16() {
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르세요");
		label = new JLabel("아직 버튼이 클릭되지 않았습니다");
		
		
		button.addActionListener(e->{
			label.setText("드디어 버튼이 클릭됨");
		});
		
		panel.add(button); panel.add(label);
		add(panel);
		
		setVisible(true);
	}
}

public class UiTest16 {

	public static void main(String[] args) {
		new MyFrame16();
	}

}
