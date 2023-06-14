class M100
{
	public static void main(String[] args) 
	{	
		for(char i='p';i<='u';i++)
		{
			for(char j='p';j<=i;j++)
				{
				if(j=='p'||i==j)
					{
					System.out.print(j+" ");
					}
					else
					{
						System.out.print("0 ");
					}
				}
				System.out.println();
		}
	
		 for(char i='v';i<='z';i++)
			{

			for(char j='z';j>=i;j--)
			{
				 if(j=='z')
				{
					System.out.print("p ");
				}
				else if(i==j)
				{
					System.out.print(i+" ");
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
p
p q
p 0 r
p 0 0 s
p 0 0 0 t
p 0 0 0 0 u
p 0 0 0 v
p 0 0 w
p 0 x
p y 
p



D:\logicalcoding\app1\src>java -cp ../classes M100
p
p q
p 0 r
p 0 0 s
p 0 0 0 t
p 0 0 0 0 u
p 0 0 0 v
p 0 0 w
p 0 x
p y
p

*/