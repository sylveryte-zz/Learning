import java.awt.*;
import javax.swing.*;

class gtest implements Runnable
{
	JFrame f=new JFrame();
	Thread t=new Thread(this);
	myJPanel jp;

	public void init()
	{
		f.setSize(700,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		jp=new myJPanel(t,f);
		f.getContentPane().add(BorderLayout.CENTER,jp);
	}
	public void run()
	{
		init();
	}
}

class myJPanel extends JPanel
{
	Thread t;
	JFrame f;
	myJPanel(Thread t,JFrame f)
	{
		this.t=t;
		this.f=f;
	}
	public void paintComponent(Graphics g)
	{
		for (int i=0; i<400; i+=40) 
		{
			f.repaint();
			g.fillOval(200,i,202,102);
			try
			{
				t.sleep(600);
			}	
			catch(InterruptedException e)
			{}
		}
		
	}
}

class GStory 
{
	public static void main(String[] args) 
	{
		gtest g=new gtest();
		g.init();	
	}
}