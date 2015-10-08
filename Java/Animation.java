import java.io.*;
import java.awt.*;
import java.applet.*;
/*
<applet code="Animation"  width=500 height=500>
</applet>
*/
public class Animation extends Applet
{	
	int x=0,y=0,w=20,h=20,flag=0;	
	Color c=new Color(255,100,203);
	public void paint(Graphics g)
	{
		//setBackground(Color.cyan);
		for(int i=0;i<180;i=i+20)
		{
			for(int j=0;j<160;j=j+20)
			{
			g.fillRect(x+j,y,h,w);
			x=x+20;
			}

		if(flag%2==0)
		{
		x=0;
		x=x+20;
		y=y+20;
		}
		else
		{
		x=0;
		y=y+20;
		}
		flag++;
		}
	}
}
