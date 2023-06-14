class M98
{
	public static void main(String[] args) 
	{	
		for(char i='p';i<='u';i++)
		{
			for(char j='p';j<=i;j++)
				{
				if(j=='p'||i==j)
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
	for(char i='t';i>='p';i--)
		{
		for(char j='p';j<=i;j++)
			{

			if(j=='p'||i==j)
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
0 q 0
0 q r 0
0 q r s 0
0 q r s t 0
0 q r s 0
0 q r 0
0 q 0
0 0
0

D:\logicalcoding\app1\src>java -cp ../classes M98
0
0 0
0 q 0
0 q r 0
0 q r s 0
0 q r s t 0
0 q r s 0
0 q r 0
0 q 0
0 0
0



*/