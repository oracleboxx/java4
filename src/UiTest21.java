import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/* 스윙 컴포넌트 종류)
 * 1. JCheckBox : 네모 버튼을 만들고 하나 또는 하나 이상의 복수개를 선택할 수 있다.
 * 2.JRadioButton : JRadioButton 객체를 = ButtonGroup에 추가하면 단 하나의 동그라미 버튼 만 선택가능하게된다.
 * 3.JTextArea : 한줄이상 여러줄을 입력할 수 있는 입력박스를 만든다.
 * 4.JComboBox : 화면은 작아서 리스트 항목을 모두 표시할 수 없을때 선택된 리스트 항목만 표시되고 나머지는 숨겨져서 리스트
 *				 항목으로 표시하고자 할 때 이 컴포넌트를 사용한다.
 *  
 */
//JTextArea 실습 예제
public class UiTest21 extends JFrame implements ActionListener{
	protected JTextField textField;
	protected JTextArea textArea;
	public UiTest21() {
		setTitle("TextArea 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textField = new JTextField(30);
		textField.addActionListener(this);//텍스트 필드 이벤트 등록
 textField.setSize(500,500);
		textArea = new JTextArea(10,30);
		textArea.setEditable(false);
		add(textField, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);
		pack();// 각 컴포넌트 크기에 맞게 스윙 프레임 윈도우 크기 조절됨
		setVisible(true);

	}
	public static void main(String[] args) {
		new UiTest21();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String text = textField.getText();// 텍스트필드에 입력한 값을 문자열로 구함
		textArea.append(text+"\n");//textArea에 기존내용을 유지한 채 추가하고 다음줄로 줄빠꿈(\n
		textField.selectAll();
	}
}
