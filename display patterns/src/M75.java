class M75
{
	public static void main(String[] args) 
	{
		
		for(int i=7;i>=1;i--)
		{
			for(int j=7;j>=i;j--)

			{
				
				System.out.print("  ");
	
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k+" ");
			}
		System.out.println();
		
	}
}
}


/*
 7 6 5 4 3 2 1
    6 5 4 3 2 1
       5 4 3 2 1
         4 3 2 1
            3 2 1
               2 1
                  1


D:\logicalcoding\app1\src>java -cp ../classes M75
  7 6 5 4 3 2 1
     6 5 4 3 2 1
        5 4 3 2 1
           4 3 2 1
              3 2 1
                2 1
               1
			  */