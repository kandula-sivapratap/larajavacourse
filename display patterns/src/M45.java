class M45 
{
	public static void main(String[] args) 
	{
		for(char ch='A';ch<='F';ch++ )	
		  //i=rows,  j=cols
		{
		for(char j=ch;j>='A';j-- ) 	
			{
				System.out.print(ch=='C'&&j=='A'?'C':j+ " " );
			}
			System.out.println();
		}	
	}
}
