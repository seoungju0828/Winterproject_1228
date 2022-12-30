package GUI_test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ButtonActionListener implements ActionListener {
	
	JButton btn1, btn2;
	JLabel lb1;
	
	public ButtonActionListener(JButton btn1, JButton btn2, JLabel lb1) {
		super();
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.lb1 = lb1;
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		ImageIcon icon = null;
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
