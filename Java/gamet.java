import java.io.*;
import java.util.*;

class gamet

{

  public static void main (String[] arg)
{int k=0,i=0,j=(int)(Math.random()*21+1);
 Scanner sc=new Scanner(System.in); 
System.out.println("GuessNumberBetween1-21!\n");
   do{
     System.out.print("Guess:");
       i=sc.nextInt();
 	k++;
     if(i>j-3&&i<j+3)
     System.out.print("Close!!\n");
    } while(i!=j);
   System.out.println("You won! in "+k+" tries!!");
}
}