import javax.swing.JTextField;


public class JTextFieldExample extends JTextField
{

	public JTextFieldExample(String text, int width)
	{
		super(text); // default text i�in gerekli
		setColumns(width);
//		alt: tek seferde
//		super(text, width); 
	}
}
