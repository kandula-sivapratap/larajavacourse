class A 
{
	static void test()
	{
		System.out.println("FROM A.test");
	}
}
	static
	{
		System.out.println("from A.sib");
	}
		
	class B
	{
		static void test()
	{
		System.out.println("from b.test ");
	}
	}
	static
	{
		System.out.println("from A.sib");
	}
	class S
	{
	public static void main(String[] args) 
	{
		System.out.println("main bigin");
		A.test();
		System.out.println("---------------");
		B.test();
	System.out.println("---------------");
	System.out.println("main end ");
	}
}