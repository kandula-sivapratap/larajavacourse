class M93
{
	public static void main(String[] args) 
	{	
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
				{
		      	System.out.print(j+" ");
				}
				System.out.println();
			}
	for(int i=4;i>=1;i--)
		{
		for(int j=i;j>=1;j--)
			{

			System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

/*            
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1 
1


D:\logicalcoding\app1\src>java -cp ../classes M93
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1

*/