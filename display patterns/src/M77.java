class M77
{
	public static void main(String[] args) 
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)

			{
				
				System.out.print("  ");
	
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print(k+" ");
			}
		System.out.println();
		
	}
}
}


/*
 1 2 3 4 5 
    2 3 4 5
       3 4 5
          4 5
             5


D:\logicalcoding\app1\src>java -cp ../classes M77
  1 2 3 4 5
     2 3 4 5
        3 4 5
           4 5
              5
			  */