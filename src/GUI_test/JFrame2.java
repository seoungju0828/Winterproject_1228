package GUI_test;
//Inner(내부) 클래스로 를 구현

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFrame2 extends JFrame {
	
	ImageIcon icon = new ImageIcon("Images//승주네 수산.jpg");
	JLabel lb1 = new JLabel(icon, JLabel.CENTER);
	
	JButton btn1 = new JButton("NCT 127");
	JButton btn2 = new JButton("NCT dream");
	JButton btn3 = new JButton("Red Velvet");
	
	public JFrame2() {
		JPanel pan = new JPanel();
		
		BtnListener btnListener = new BtnListener();
		
		btn1.addActionListener(btnListener);
		btn2.addActionListener(btnListener);
		btn3.addActionListener(btnListener);
		
		
		pan.add(btn1); pan.add(btn2); pan.add(btn3);
		add(pan, "North");
		add(lb1);
		
		setTitle("Jframe 상속 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200, 300);
		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		new JFrame2();
		
	}
	
	public class BtnListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			JButton btnSource = (JButton) e.getSource();
			
			if (btnSource == btn1) {
				icon = new ImageIcon("Images/NCT 127.jpg");
			}else if (btnSource == btn2) {
				icon = new ImageIcon("Images/NCT dream.jpg");
			}else {
				icon = new ImageIcon("Images/Redvelvet.jpg");
			}
			lb1.setIcon(icon);
		}
		
	}
	
}
