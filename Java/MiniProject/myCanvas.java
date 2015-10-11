import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class myCanvas extends JPanel 
{
	public Graphics2D gr;
	Random r=new Random();
	BrushClass[] brcl=new BrushClass[11];

	Dimension d;
	myCanvas(Dimension d)
	{
		this.d=d;
		// System.out.println(d.height+" w"+d.width);
		for (short i=0;i<11 ;i++ ) {
			brcl[i]=new BrushClass(i+1,d.height);
			}	
	}
	public void paintComponent(Graphics g)
	{
		this.gr=(Graphics2D)g;
		Image im=new ImageIcon("f.jpg").getImage();
		g.drawImage(im,0,0,d.width-100,d.height-100,this);
		// paintWildBox();
		// brcl.paintit(8);
		// GradientPaint grd=new GradientPaint(0,0,getColor(),d.width-100,d.height,getColor(),true);
		// gr.setPaint(grd);

		g.fillRect(30,470,550,10);

		for (short i=0;i<11 ;i++ ) {
			brcl[i].paintit(8);
		}
//		g.setColor(Color.white);
//		g.drawString("by Suzzaine & Sylveryte",4,15);
	}



		class BrushClass
		{
			int y;
			int x;
			int bxsize=20;
			int bxspace=bxsize/4;

			BrushClass(int base,int kl)
			{
				y=kl;
				final int y;
				x=base*50;
			}
			void paintit(int i)
			{
				// System.out.println("final y:"+y);
				i=r.nextInt(i-1)+1;
				// gr.setColor(getColor());
				GradientPaint grd=new GradientPaint(0,0,getColor(),d.width-100,d.height,getColor(),true);
				gr.setPaint(grd);
				for (int ty=y-150;i>=0;i--,ty-=bxsize+bxspace) 
				{
					// System.out.println("idhar"+x+" y"+y+"ty"+ty);
					gr.fillRect(x,ty,bxsize,bxsize);
				}
			}
		}



	Color getColor()
	{
		return new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
	}


	void paintWildBox()
	{
		GradientPaint grd=new GradientPaint(0,0,getColor(),800,600,getColor(),true);
		gr.setPaint(grd);
		gr.fillRect(r.nextInt(400),r.nextInt(500),r.nextInt(d.width),r.nextInt(d.height));
	}

	
}