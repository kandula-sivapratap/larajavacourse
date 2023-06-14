class A 
{
	static void test()
	{
		System.out.println("FROM A.test");
	}

}
	class Q
	{
	public static void main(String[] args) 
	{
		System.out.println("main bigin");
		test();
		System.out.println("main end ");
	}
}
