class threadP implements Runnable
{
	private String check;
	private int time;
	threadP(String c,int t)
	{
		check=c;
		time=t;
		//Thread.currentThread().start();
	}
	public void run()
	{
		for(;;){
		System.out.println("checking "+check);
		try
		{
			Thread.sleep(time*1000);
		}
		catch(InterruptedException e){}
	}}
}
class ThreadPr
{
	public static void main(String[] args)
	{
	//	Thread.currentThread().start();
		Runnable t=new threadP("oil",1);
		Runnable tr=new threadP("water",2);
		Runnable tr1=new threadP("res",3);
		Runnable tr2=new threadP("wcle",4);
		Runnable tr3=new threadP("poeir",5);
		new Thread(t).start();
		new Thread(tr1).start();
		new Thread(tr).start();
		new Thread(tr2).start();
		new Thread(tr3).start();
	}
}