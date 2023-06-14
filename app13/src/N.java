class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while (i<=2)
		{
			System.out.println("loop begin:"+i);
			for (int j=101;j<=103 ;j++ )
			{
				System.out.println("loop begin:"+i+","+j);
				if (j==102)
				{
					break;
				}
				System.out.println("loop end:"+i+","+j);
			}
			System.out.println("loop end:"+i);
			i++;
		}
	    System.out.println("main end:"+i);
	}
}


/*D:\lab\app13\src>java -cp ../classes N
main begin
loop begin:1
loop begin:1,101
loop end:1,101
loop begin:1,102
loop end:1
loop begin:2
loop begin:2,101
loop end:2,101
loop begin:2,102
loop end:2
main end:3*/