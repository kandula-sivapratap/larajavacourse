class X 
{
	public static void main(String[] args) 
	{
		System.out.println("from main");
		test();
		System.out.println("main end");

	}
		public static int test() 
	{
		System.out.println("from test");
		return 100;
	}
}
		