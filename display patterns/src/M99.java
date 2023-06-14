class M99
{
	public static void main(String[] args) 
	{	
		for(char i='a';i<='f';i++)
		{
			for(char j='a';j<=i;j++)
				{
					System.out.print(j+" ");
					}
					
					System.out.println();
		}
	
	   for(char i='e';i>='a';i--)
		{
			for(char j='a';j<=i;j++)
			{
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}


/*            

a
a b
a b c
a b c d
a b c d e
a b c d e f
a b c d e 
a b c d 
a b c 
a b 
a


D:\logicalcoding\app1\src>java -cp ../classes M99
a
a b
a b c
a b c d
a b c d e
a b c d e f
a b c d e
a b c d
a b c
a b
a


*/