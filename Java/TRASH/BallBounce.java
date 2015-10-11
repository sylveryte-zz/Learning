import java.applet.*;  
 import java.awt.*;  
 import java.awt.event.*;  
 import java.util.Random;
/*
 <applet code=BallBounce.java height=500 width=500>
 </applet>
 */
   public class BallBounce extends Applet implements Runnable  
 {  
 Random r = new Random(); 
 Dimension d=new Dimension(500,500);
    int x = 10, y = 10,dia1 = 0, dia2 = 0, higt = 500 , widt = 500;  
 public void init()  
 {  
 Thread th = new Thread(this); 
 th.start(); 
 }  
 public void run()  
 {  
 while(true)  
 {  
 try  
 {  
 repaint();  
 Thread.sleep(50);      
 if( x < widt - 100)
 x += 5;  
 if( y < higt - 100)  
 y += 5;  
 if( x > widt - 100)  
 x = widt - 100;  
 if( y > higt - 100)  
 y = higt - 100;  
 dia1 += 10;  
 dia2 += 10;  
 }  
 catch(Exception e)  
 {
System.out.println("Ball is out of the screen");
}  
 }  
 }  
 public void paint(Graphics gc)  
 {  
 Dimension di = getSize();  
 higt = d.height;  
 widt = d.width;  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255))); 
 gc.fillArc(x,20,100,100,dia1,90);  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 gc.fillArc(x,20,100,100,dia1 + 90,90);  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 gc.fillArc(x,20,100,100,dia1 + 180,90);  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 gc.fillArc(x,20,100,100,dia1 + 270,90);  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 gc.fillArc(10, y, 100, 100, dia2 ,90);  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 gc.fillArc(10,y,100,100, dia2 + 90,90);  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 gc.fillArc(10,y,100,100,dia2 + 180,90);  
 gc.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 gc.fillArc(10,y,100,100,dia2 + 270,90);  
 }  
 }
