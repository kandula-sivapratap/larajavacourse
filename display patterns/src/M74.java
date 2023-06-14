class M74
{
	public static void main(String[] args) 
	{
		
		for(int i=7;i>=1;i--)
		{
			for(int j=7;j>=i;j--)

			{
				
				System.out.print("  ");
	
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
		System.out.println();
		
	}
}
}


/*
  7 7 7 7 7 7 7 
     6 6 6 6 6 6
        5 5 5 5 5
           4 4 4 4
              3 3 3 
                 2 2
                    1

D:\logicalcoding\app1\src>java -cp ../classes M74
  7 7 7 7 7 7 7
    6 6 6 6 6 6
       5 5 5 5 5
         4 4 4 4
           3 3 3
             2 2
               1
			  */