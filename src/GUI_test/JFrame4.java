package GUI_test;
//독립 된 ActionListener클래스를 사용하자

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFrame4 extends JFrame {
	
	ImageIcon icon = new ImageIcon("Images//승주네 수산.jpg");
	JLabel lb1 = new JLabel(icon, JLabel.CENTER);
	
	JButton btn1 = new JButton("NCT 127");
	JButton btn2 = new JButton("NCT dream");
	JButton btn3 = new JButton("Red Velvet");
	
	public JFrame4() {
		JPanel pan = new JPanel();
		
		ButtonActionListener btnListener = new ButtonActionListener(btn1, btn2, lb1);
		
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
		
		new JFrame4();
		
	}
	
}
