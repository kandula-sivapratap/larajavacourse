class M107
{
	public static void main(String[] args) 
	{
		
		for (int i=1;i<=6 ;i++ )
		{
			char n='a';
			for (int j=i;j<6 ;j++ )
			{
				System.out.print("  ");
			}
			for (int k=1;k<=2*i-1;k++ ,n++)
			{
				System.out.print(k==1||k==2*i-1||i==6 ? n +" ":"0 "  );
			}
			System.out.println();
			}

			
		}
	
}


/* 
           a
         a 0 c 
       a 0 0 0 e   
    a 0 0 0 0 0 g 
  a 0 0 0 0 0 0 0 i
a b c d  e f g h i j k 


D:\logicalcoding\app1\src>java -cp ../classes M107
          a
        a 0 c
      a 0 0 0 e
    a 0 0 0 0 0 g
  a 0 0 0 0 0 0 0 i
a b c d e f g h i j k
*/