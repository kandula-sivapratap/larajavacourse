class M90
{
	public static void main(String[] args) 
	{	
		for(char i='P';i<='U';i++)
		{
			for(int j='U';j>=i;j--)
			{
				System.out.print("  ");
			}
			for(char k='P';k<=i;k++)
			{
				if(i=='P'||i==k||k=='P'||i=='U')
				{
					System.out.print(k+" ");
				}
				else if(i>k)
				{
					System.out.print(((i-k)-4)+" ");
				}
				
			}
			System.out.println();
	}
	}

}

/*                P
               P  Q
             P 0 R
          P 0 1 S
	   P 0 1 2 T
	P Q R S T U


D:\logicalcoding\app1\src>java -cp ../classes M89
            P
          P P
        P 0 P
      P 0 1 P
    P 0 1 2 P
  P P P P P P	  */