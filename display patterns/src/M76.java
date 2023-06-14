class M76
{
	public static void main(String[] args) 
	{
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)

			{
				
				System.out.print("  ");
	
			}
			for(int k=7;k>=i;k--)
			{
				System.out.print(k+" ");
			}
		System.out.println();
		
	}
}
}


/*
 7 6 5 4 3 2 1
    7 6 5 4 3 2
       7 6 5 4 3 
          7 6 5 4
             7 6 5
                7 6
                   7


D:\logicalcoding\app1\src>java -cp ../classes M76
  7 6 5 4 3 2 1
    7 6 5 4 3 2
      7 6 5 4 3
        7 6 5 4
          7 6 5
            7 6
               7
			  */