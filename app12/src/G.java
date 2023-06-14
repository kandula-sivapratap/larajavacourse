class G 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i=0;i<=10; i++ )
		{
			System.out.println("loop begin"+i);
			if (i == 4)
			{
				System.out.println("if bigin");
				break;
				i++;
			}
			System.out.println("loop end"+i);
		}
		System.out.println("main end");
	}
}



/*D:\lab\app12\src>javac -d ../classes G.java
G.java:13: error: unreachable statement
                                i++;
                                ^
1 error
*/