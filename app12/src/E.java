class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i=0;i<=10; i++ )
		{
			System.out.println("loop begin"+i);
			if (i <= 4)
			{
				System.out.println("if bigin");
				continue;
			}
			System.out.println("loop end"+i);
		}
		System.out.println("main end");
	}
}
