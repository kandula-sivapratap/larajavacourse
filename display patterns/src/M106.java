class M106
{
	public static void main(String[] args) 
	{
		
		for (int i=6;i>=1 ;i-- )
		{
			char n='a';
			for (int j=1;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int k=11;k>=2*i-1;k-- )
			{
				System.out.print(n++  +" ");
			}
			System.out.println();
			}

			
		}
	
}


/* 
                         a
                      a b c 
                   a b c d e   
                a b c d e f g 
             a b c d e f g h i
		  a b c d  e f g h i j k 

D:\logicalcoding\app1\src>java -cp ../classes M106
          a
        a b c
      a b c d e
    a b c d e f g
  a b c d e f g h i
a b c d e f g h i j k

*/