class myThread implements Runnable
{	
	Thread t;
	myThread()
	{
		t=new Thread(this,"CT");
		t.start();
	}
	public void run()
	{
		for(int i=7;i>0;System.out.println("ct:"+i--));
		{
			try
			{
				t.sleep(1);
			}
			catch(InterruptedException e)
			{}
		}
	}
}
class mulThread
{
	public static void main(String[] args)
	{
		Thread y=Thread.currentThread();
		new myThread();
		for(int i=57;i>50;System.out.println("mmatlab main samjha kya t:"+i--));
		{
			try
			{
				y.sleep(0);
			}
			catch(InterruptedException e)
			{}
		}
	}
}