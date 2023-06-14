class M23 
{
	public static void main(String[] args) 
	{
		for ( int row = 0;row <= 5 ;row++)
		{
			for ( char cols = 'A';cols <= 'F';cols++ )
			{
				int i =cols+row;
				char c=(char)i;  
				System.out.print((c)+" ");
				
			}System.out.println();
		}
		
	}
}