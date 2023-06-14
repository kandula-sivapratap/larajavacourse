class M105
{
	public static void main(String[] args) 
	{
		
		for (int i=5;i>=1 ;i-- )
		{
			int n=2*i-1;
			for (int j=1;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int k=9;k>=2*i-1;k-- )
			{
				System.out.print(n++  +" ");
			}
			System.out.println();
			}

			
		}
	
}


/* 
                         9
                      7 8 9 
                   5 6 7 8 9  
                3 4 5 6 7 8 9 
             1 2 3 4 5 6 7 8 9 



D:\logicalcoding\app1\src>java -cp ../classes M105
        9
      7 8 9
    5 6 7 8 9
  3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9

*/