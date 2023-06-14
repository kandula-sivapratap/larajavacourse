class K 
{
	public static void main(String[] args) 
	{
		int i =10;
		System.out.println("main begin:");
		test1();
		System.out.println("--------------");
		System.out.println("main begin:");
		test2();
		System.out.println("main end:");
		
	}
	public static void test1()
	{
		System.out.println("from test1 begin");
	     test2();
		System.out.println("from test1 end");
	}
	public static void test2()
	{
		System.out.println("from test 2");
		test1();
	}

}
