class M25 
{
	public static void main(String[] args) 
	{
		for ( int row = 1;row <= 5 ;row++)
		{
			for ( char cols = 'F';cols >= 'A' ;cols-- )
			{
				int i =cols+row-1;
				char c=(char)i;  
				System.out.print(c+" ");
				
			}System.out.println();
		}
		
	}
}