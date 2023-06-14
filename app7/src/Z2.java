class Z2 
{
	public static void main(String[] args) 
	{
		System.out.println("main bigin");
		if(false);
			System.out.println("if block stmt1");
			System.out.println("if block stmt2");
			System.out.println("if block stmt3");
		System.out.println("main end");
	}
	
}



/*D:\lab\app7\src>java -cp ../classes Z2
main bigin
if block stmt1
if block stmt2
if block stmt3
main end*/
