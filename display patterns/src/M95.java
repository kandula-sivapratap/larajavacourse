class M95
{
	public static void main(String[] args) 
	{	
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
				{
		      	System.out.print(i+" ");
				}
				System.out.println();
			}
	for(int i=4;i>=1;i--)
		{
		for(int j=i;j>=1;j--)
			{

			System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

/*            
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
4 4 4 4
3 3 3
2 2 
1


D:\logicalcoding\app1\src>java -cp ../classes M95
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
*/