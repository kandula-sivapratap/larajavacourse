class M73
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
				System.out.print(k+" ");
			}
		System.out.println();
		
	}
}
}


/*
  1 2 3 4 5 6 7
     1 2 3 4 5 6 
        1 2 3 4 5
          1 2 3 4
             1 2 3
                1 2
                   1
D:\logicalcoding\app1\src>java -cp ../classes M73
  1 2 3 4 5 6 7
    1 2 3 4 5 6
      1 2 3 4 5
        1 2 3 4
           1 2 3
             1 2
                1
			  */