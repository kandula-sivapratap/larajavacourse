class M91
{
	public static void main(String[] args) 
	{	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
				{
		      	System.out.print(1+" ");
				}
				System.out.println();
			}
	for(int i=5;i>1;i--)
		{
		for(int j=1;j<i;j++)
			{

			System.out.print("1 ");
			}
			System.out.println();
		}
	}
}

/*            
1
1 1
1 1 1
1 1 1 1
1 1 1 1 1
1 1 1 1 
1 1 1 
1 1 
1



D:\logicalcoding\app1\src>java -cp ../classes M91
1
1 1
1 1 1
1 1 1 1
1 1 1 1 1
1 1 1 1
1 1 1
1 1
1
*/