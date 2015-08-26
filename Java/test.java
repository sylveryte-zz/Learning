//template


import java.util.*;
import java.net.*;

class test
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
		
		int a=1;
		int b=2;
		boolean be=true;
		System.out.println(a+" "+b);
		System.out.println(a|b);
		if(!be)
		{System.out.println(a|b);
		}
		StringBuffer s=new StringBuffer(9);
		//s.setCharAt(0,'r');
		System.out.println(s);
		
		
		
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}