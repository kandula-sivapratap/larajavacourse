class F 
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
			}
			System.out.println("loop end"+i);
		}
		System.out.println("main end");
	}
}





/*D:\lab\app12\src>java -cp ../classes F
main begin
loop begin0
loop end0
loop begin1
loop end1
loop begin2
loop end2
loop begin3
loop end3
loop begin4
if bigin
main end
*/