class M85
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
				if(i==1||i==k||k==7)
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

/*               7
               6 6
            5 0 5
         4 0 0 4 
      3 0 0 0 3
   2 0 0 0 0 2
1 1 1 1 1 1 1

D:\logicalcoding\app1\src>java -cp ../classes M85
               7
             6 6
           5 0 5
        4 0 0 4
      3 0 0 0 3
    2 0 0 0 0 2
  1 1 1 1 1 1 1
	  */