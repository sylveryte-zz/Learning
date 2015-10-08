import javax.swing.*;
import java.awt.event.*;
class Graphic implements ActionListener
{
	JFrame f=new JFrame();
	JButton b=new JButton("yoho");
	void go()
	{
		b.addActionListener(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(b);
		f.setSize(200,200);
		f.setVisible(true);
	}
		
	public static void main(String[] args)
	{
		Graphic g=new Graphic();
		g.go();
	}

	public void actionPerformed(ActionEvent av)
	{
		b.setText("yolo");
	}
	
}