class M83
{
	public static void main(String[] args) 
	{	
		for(int i=7;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k<=7;k++)
			{
				if(i==7||i==k||k==7)
				{
				System.out.print(k+" ");
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

/*               7
               6 7
             5 0 7
           4 0 0 7 
         3 0 0 0 7
       2 0 0 0 0 7
     1 0 0 0 0 0 7


D:\logicalcoding\app1\src>java -cp ../classes M83
                 7
              6 7
            5 0 7
         4 0 0 7
       3 0 0 0 7
    2 0 0 0 0 7
  1 0 0 0 0 0 7

	  */