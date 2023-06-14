class M94
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
	for(int i=6;i<=9;i++)
		{
		for(int j=i;j<=9;j++)
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
6 6 6 6
7 7 7
8 8 
9

D:\logicalcoding\app1\src>java -cp ../classes M94
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6
7 7 7
8 8
9
*/