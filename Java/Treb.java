class Treb
{
	static String s="hlelo";
		
	static class ch implements Runnable
	{
		public void run()
		{
			for(;;){
			System.out.println(s); 
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){}
		}
		}
	}


	public static void main(String[] s)
	{
		Thread t=Thread.currentThread();
		ch c=new ch();
		new Thread(c).start();
		for(;;){
		System.out.println("main");
		try
			{
				t.sleep(1000);
			}
			catch(InterruptedException e){}
	}}
	
}