import javax.swing.JFrame;


public class JFrameExample extends JFrame
{

	public JFrameExample()
	{
		setLocation(250,250);
		setSize(GUIProgram.width + 20, GUIProgram.height + 60); // artt�rmak etkisiz gibi geldi
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My JFrame Example");
		setBounds(0, 0, GUIProgram.width + 20, GUIProgram.height + 60);
		setVisible(true);
	}
}
