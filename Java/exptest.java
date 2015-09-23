class exptest
{
	public static void main(String[] args)
	{
		int a=6,h=0;
		try
		{
			a=5/h;
			System.out.println("try k baad");
		}
		catch(ArithmeticException e)
		{
			System.out.println("art exception");
		}
		System.out.println(a);
	}
}