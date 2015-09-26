import javax.swing.*;
class Graphic
{
	public static void main(String[] args)
	{
		JFrame f=new JFrame();
		JButton b=new JButton("yoho");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(b);
		f.setSize(200,200);
		f.setVisible(true);
		
	}
}