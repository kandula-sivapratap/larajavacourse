class M97
{
	public static void main(String[] args) 
	{	
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
				{
				if(j==0||i==j)
					{
				System.out.print("0 ");
				}
				else
					{
					System.out.print(j+" ");
					}
					}
					System.out.println();
		}
	for(int i=4;i>=0;i--)
		{
		for(int j=0;j<=i;j++)
			{

			if(j==0||i==j)
					{
				System.out.print("0 ");
				}
				else
					{
					System.out.print(j+" ");
					}
					
			}
		System.out.println();
		}
	}
}


/*            

0
0 0
0 1 0
0 1 2 0
0 1 2 3 0
0 1 2 3 4 0
0 1 2 3 0
0 1 2 0
0 1 0
0 0 
0

D:\logicalcoding\app1\src>java -cp ../classes M97
0
0 0
0 1 0
0 1 2 0
0 1 2 3 0
0 1 2 3 4 0
0 1 2 3 0
0 1 2 0
0 1 0
0 0
0


*/