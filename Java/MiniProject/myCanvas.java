import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class myCanvas extends JPanel 
{
	public Graphics2D gr;
	Random r=new Random();
	Dimension d;
	myCanvas(Dimension d)
	{
		this.d=d;
	}
	public void paintComponent(Graphics g)
	{
		this.gr=(Graphics2D)g;
		Image im=new ImageIcon("f.jpg").getImage();
		g.drawImage(im,0,0,d.width-100,d.height-100,this);
		paintWildBox();
//		g.setColor(Color.white);
//		g.drawString("by Suzzaine & Sylveryte",4,15);
	}

	void paintWildBox()
	{
		GradientPaint grd=new GradientPaint(0,0,new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)),800,600,new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)),true);
		gr.setPaint(grd);
		gr.fillRect(r.nextInt(400),r.nextInt(500),r.nextInt(d.width),r.nextInt(d.height));
	}

	
}