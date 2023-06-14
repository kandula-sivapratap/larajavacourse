package pack1;
class D 
{
	private void test()
	{
	  System.out.println("from test()");
	}
}
class E 
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test();
		System.out.println("done");
	}
}
/*D:\lab\access-levels\app1\src>javac -d ../classes pack1/E.java
pack1\E.java:14: error: test() has private access in D
                d1.test();
                  ^
1 error*/ 