import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ButtonPressAction implements ActionListener
{
	public void actionPerformed(ActionEvent arg0) {
//		we have multiple buttons that call this actionlistener
//		and we want to know which button calls to respond 
//		specifically for each button press.
//		that is why we cast the arg0 and return the object into a jbutton
//		getName metodu jbutton object sayesinde ula��labiliyor
		JButton jb = (JButton)arg0.getSource();

//		showMessageDialog'un showInputDialog'dan fark�
//		textfield bar�nd�rmamas�d�r
		JOptionPane.showMessageDialog(null, "Button: "
				+ jb.getName() + " pressed!");
//		jb.getName(): BUTTON_TWO
	}
	
}
