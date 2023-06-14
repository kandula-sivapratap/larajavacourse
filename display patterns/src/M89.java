class M89
{
	public static void main(String[] args) 
	{	
		for(char i='A';i<='F';i++)
		{
			for(int j='F';j>=i;j--)
			{
				System.out.print("  ");
			}
			for(char k=i;k>='A';k--)
			{
				if(i=='A'||i=='F'||i==k||k=='A')
				{
					System.out.print("P ");
				}
				else 
				{
					System.out.print((k<i)? (i-k)-1+ " ":"0 ");
				}
				
			}
			System.out.println();
	}
	}

}

/*                P
               P  P
             P 0 P
          P 0 1 P
	   P 0 1 2 P
	P P P P P P 


D:\logicalcoding\app1\src>java -cp ../classes M89
            P
          P P
        P 0 P
      P 0 1 P
    P 0 1 2 P
  P P P P P P	  */