class M24
{
	public static void main(String[] args) 
	{
		for(char i='F';i>='A';i--)   //i=rows,  j=cols
		{
			for(char j='A';j<='F';j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}



/*class A24 
{
	public static void main(String[] args) 
	{
		for ( char row = 'F';row >= 'A' ;row--)
		{
			for ( char cols = 'A';cols <= 'F';cols++ )
			{
				//int i =cols+row;
				//char c=(char)i;  
				System.out.print((row)+" ");
				
			}System.out.println();
		}
		
	}
}*/