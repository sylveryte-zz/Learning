import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MusicCanvas 
{
	JFrame frame;
	myCanvas canvas;
	SoundEngine se;
	Toolkit tr=Toolkit.getDefaultToolkit();
	Dimension dim=tr.getScreenSize();
	Thread t=Thread.currentThread();
	// static  int i=60;

	MusicCanvas()
	{
		se=new SoundEngine();
		frame=new JFrame("Music Canvas");
		keyMatter();//put this first//j :::? :/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas=new myCanvas(dim);
		frame.getContentPane().add(BorderLayout.CENTER,canvas);
		frame.setSize(dim.width-100,dim.height-100);
		frame.setResizable(false);
		frame.getContentPane().add(canvas);			
		frame.setVisible(true);
	}

	void keyMatter()
	{
		KeyListener kl=new KeyListener(){
			public void keyTyped(KeyEvent e)
			{
			
			}
			public void keyReleased(KeyEvent e)
			{
				int i=e.getKeyCode();
					// short c=0;
				
				
				// canvas.paintWildBox();				
				frame.repaint();

				try
				{
					t.setPriority(1);
					Thread.sleep(250);
				}catch (Exception es) {}
				
				switch(i)
				{
					// case 49 : if(se.setInst(1)){System.out.println("Instrument 1 selected");} break;
					// case 50 : if(se.setInst(1)){System.out.println("Instrument 2 selected");} break;
					// case 51 : if(se.setInst(1)){System.out.println("Instrument 3 selected");} break;
					// case 52 : if(se.setInst(1)){System.out.println("Instrument 4 selected");} break;
					// case 53 : if(se.setInst(1)){System.out.println("Instrument 5 selected");} break;
					// case 54 : if(se.setInst(1)){System.out.println("Instrument 6 selected");} break;
					// case 55 : if(se.setInst(1)){System.out.println("Instrument 7 selected");} break;
					// case 56 : if(se.setInst(1)){System.out.println("Instrument 8 selected");} break;
					// case 57 : if(se.setInst(1)){System.out.println("Instrument 9 selected");} break;
					

					case KeyEvent.VK_Q : se.playOff(0,48); break;
					case KeyEvent.VK_W : se.playOff(0,49); break;
					case KeyEvent.VK_E : se.playOff(0,50); break;
					case KeyEvent.VK_R : se.playOff(0,51); break;
					case KeyEvent.VK_T : se.playOff(0,52); break;
					case KeyEvent.VK_Y : se.playOff(0,53); break;
					case KeyEvent.VK_U : se.playOff(0,54); break;
					case KeyEvent.VK_I : se.playOff(0,55); break;
					case KeyEvent.VK_O : se.playOff(0,56); break;
					case KeyEvent.VK_P : se.playOff(0,57); break;
					case 91 : se.playOff(0,58); break; //[
					case 93 : se.playOff(0,59); break;//]




					case KeyEvent.VK_A : se.playOff(0,60); break;
					case KeyEvent.VK_S : se.playOff(0,61); break;
					case KeyEvent.VK_D : se.playOff(0,62); break;
					case KeyEvent.VK_F : se.playOff(0,63); break;
					case KeyEvent.VK_G : se.playOff(0,64); break;
					case KeyEvent.VK_H : se.playOff(0,65); break;
					case KeyEvent.VK_J : se.playOff(0,66); break;
					case KeyEvent.VK_K : se.playOff(0,67); break;
					case KeyEvent.VK_L : se.playOff(0,68); break;
					case 59 : se.playOff(0,69); break; //;
					case 222 : se.playOff(0,70); break;//''
					case 10 : se.playOff(0,71); break;//enter key



					case KeyEvent.VK_Z : se.playOff(0,72); break;
					case KeyEvent.VK_X : se.playOff(0,73); break;
					case KeyEvent.VK_C : se.playOff(0,74); break;
					case KeyEvent.VK_V : se.playOff(0,75); break;
					case KeyEvent.VK_B : se.playOff(0,76); break;
					case KeyEvent.VK_N : se.playOff(0,77); break;
					case KeyEvent.VK_M : se.playOff(0,78); break;
					case 44 : se.playOff(0,79); break; //,
					case 46 : se.playOff(0,80); break;//.
					case 47 : se.playOff(0,81); break; ///
					case 16 : se.playOff(0,82); break;//SHIFT
					// case 10 : se.playOff(0,71); break;//enter key



					default : System.out.print("\nWrong Key" + i); break;
				}
				 
				
				
			}
			public void keyPressed(KeyEvent e)
			{
				int i=e.getKeyCode();
				switch(i)
				{

					case KeyEvent.VK_Q : se.playOn(0,48); break;
					case KeyEvent.VK_W : se.playOn(0,49); break;
					case KeyEvent.VK_E : se.playOn(0,50); break;
					case KeyEvent.VK_R : se.playOn(0,51); break;
					case KeyEvent.VK_T : se.playOn(0,52); break;
					case KeyEvent.VK_Y : se.playOn(0,53); break;
					case KeyEvent.VK_U : se.playOn(0,54); break;
					case KeyEvent.VK_I : se.playOn(0,55); break;
					case KeyEvent.VK_O : se.playOn(0,56); break;
					case KeyEvent.VK_P : se.playOn(0,57); break;
					case 91 : se.playOn(0,58); break; //[
					case 93 : se.playOn(0,59); break;//]




					case KeyEvent.VK_A : se.playOn(0,60); break;
					case KeyEvent.VK_S : se.playOn(0,61); break;
					case KeyEvent.VK_D : se.playOn(0,62); break;
					case KeyEvent.VK_F : se.playOn(0,63); break;
					case KeyEvent.VK_G : se.playOn(0,64); break;
					case KeyEvent.VK_H : se.playOn(0,65); break;
					case KeyEvent.VK_J : se.playOn(0,66); break;
					case KeyEvent.VK_K : se.playOn(0,67); break;
					case KeyEvent.VK_L : se.playOn(0,68); break;
					case 59 : se.playOn(0,69); break; //;
					case 222 : se.playOn(0,70); break;//''
					case 10 : se.playOn(0,71); break;//enter key



					case KeyEvent.VK_Z : se.playOn(0,72); break;
					case KeyEvent.VK_X : se.playOn(0,73); break;
					case KeyEvent.VK_C : se.playOn(0,74); break;
					case KeyEvent.VK_V : se.playOn(0,75); break;
					case KeyEvent.VK_B : se.playOn(0,76); break;
					case KeyEvent.VK_N : se.playOn(0,77); break;
					case KeyEvent.VK_M : se.playOn(0,78); break;
					case 44 : se.playOn(0,79); break; //,
					case 46 : se.playOn(0,80); break;//.
					case 47 : se.playOn(0,81); break; ///
					case 16 : se.playOn(0,82); break;//SHIFT
					// case 10 : se.playOn(0,71); break;//enter key



					default : System.out.print("\nWrong Key" + i); break;
				}
			}
		};
		

		frame.addKeyListener(kl);
		
	}


	

	public static void main(String[] args) 
	{
		new MusicCanvas();
	}

}

