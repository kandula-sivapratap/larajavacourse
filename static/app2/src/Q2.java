class A 
{
	static void test()
	{
		System.out.println("FROM A.test");
	}
	static
	{
		System.out.println("frtom a.sib1 ");
	}

}
	class Q2
	{
	public static void main(String[] args) 
	{
		System.out.println("main bigin");
		A.test();
		System.out.println("main end ");
	}
}
