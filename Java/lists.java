//examples of array list, linked list, stack
//oi

import java.util.*;
import java.net.*;

class lists
{
	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		InetAddress ip = InetAddress.getLocalHost();
		
		Stack st=new Stack();
		ArrayList al=new ArrayList();
		LinkedList ll=new LinkedList();
		
				
		st.push("yolo");
		st.push(3.14);
		System.out.println("Stack : "+st.toString());
		st.pop();
		st.push("starx");
		st.push(21);
		st.push("this time in october");
		System.out.println("Stack : "+st.toString());
		st.clear();
		System.out.println("Stack : "+st.toString());
		
		st.push(3.14);
		st.push(3.14);
		al.add("hello");
		ll.add("hello");
		
		
		
		System.out.println("Date : "+d);
		System.out.println("Ip address : "+ip);
		
	}
}
