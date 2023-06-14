class M104
{
	public static void main(String[] args) 
	{
		
		for (int i=1;i<=5 ;i++ )
		{

			for (int j=1;j<=6-i ;j++ )
			{
				System.out.print("  ");
			}
			for (int k=1;k<=2*i-1;k++ )
			{
				System.out.print(k+" ");
			}
			System.out.println();
			}

			
		}
	
}


/* 
                         1
                      1 2 3
                   1 2 3 4 5 
                1 2 3 4 5 6 7 
             1 2 3 4 5 6 7 8 9 



D:\logicalcoding\app1\src>java -cp ../classes M104
          1
        1 2 3
      1 2 3 4 5
    1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8 9

*/