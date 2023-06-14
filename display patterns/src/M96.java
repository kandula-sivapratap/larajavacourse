class M96
{
	public static void main(String[] args) 
	{	
		for(int i=1;i<=6;i++)
		{
			for(int j=i;j>=1;j--)
				{
				if(i==1||j==1||i==j)
					{
				System.out.print("1 ");
				}
				else
					{
					System.out.print("0 ");
					}
					}
					System.out.println();
		}
	for(int i=5;i>=1;i--)
		{
		for(int j=i;j>=1;j--)
			{

			if(i==1||j==1||i==j)
					{
				System.out.print("1 ");
				}
				else
					{
					System.out.print("0 ");
					}
					
			}
		System.out.println();
		}
	}
}

/*            

1
1 1
1 0 1
1 0 0 1
1 0 0 0 1
1 0 0 0 0 1
1 0 0 0 1
1 0 0 1
1 0 1
1 1 
1

D:\logicalcoding\app1\src>java -cp ../classes M96
1
1 1
1 0 1
1 0 0 1
1 0 0 0 1
1 0 0 0 0 1
1 0 0 0 1
1 0 0 1
1 0 1
1 1
1

*/