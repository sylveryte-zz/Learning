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
		JLabel jl=new JLabel();
		jl.setText("sdaf");

		
		KeyListener kl=new KeyListener(){
			public void keyTyped(KeyEvent e)
			{
				int i=e.getKeyCode();
				if(i==KeyEvent.VK_RIGHT);
				{
					System.out.println("rihg");
				}
			}
			public void keyReleased(KeyEvent e)
			{
				int i=e.getKeyCode();
				if(i==KeyEvent.VK_RIGHT);
				{
					System.out.println("rearihg");
				}
			}
			public void keyPressed(KeyEvent e)
			{
				int i=e.getKeyCode();
				if(i==KeyEvent.VK_RIGHT);
				{
					System.out.println("pppprihg");
				}
			}
		};

		f.addKeyListener(kl);
		f.getContentPane().add(jl);
		

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