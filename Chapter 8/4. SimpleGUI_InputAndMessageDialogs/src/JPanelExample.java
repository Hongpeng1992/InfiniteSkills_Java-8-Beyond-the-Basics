import java.awt.Color;

import javax.swing.*;


public class JPanelExample extends JPanel
{
	private JTextFieldExample jtfe;
//	field variable initialize edilmek zorunda de�il
	
	public JPanelExample()
	{
		setBorder(BorderFactory.createLineBorder(Color.black, 10, true));
		
		JLabel label1 = new JLabel("Please enter your name:");
//		panelde g�z�k�yor
		
		jtfe = new JTextFieldExample("Pamela", 30); // default text field
//		field variable'� etkiler, dolay�s�yla bu variable'a ula�an 
//		setTextFieldName metodunu da
		add(label1);
//		jLabel and JTextField are added to the panel
		add(jtfe);
	}
	
	public void setTextFieldName(String name)
	{
		if (jtfe == null) throw new IllegalStateException();
		if (name == null) throw new IllegalArgumentException();
		jtfe.setText(name);
//		jtextfield superclass�n�n settext metodu �a��r�l�yor
	}
}
