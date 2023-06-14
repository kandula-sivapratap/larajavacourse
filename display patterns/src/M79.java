class M79
{
	public static void main(String[] args) 
	{	
		for(char i='a';i<='h';i++)
		{
			for(int j='a';j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k<='h';k++)
			{
				System.out.print(i+" ");
				}
				System.out.println();
			}
		
	}

}


/*
 a a a a a a a a
   b b b b b b b
     c c c c c c c
        d d d d d
           e e e e
               f f f
                g g
                   h


D:\logicalcoding\app1\src>java -cp ../classes M79
  a a a a a a a a
    b b b b b b b
      c c c c c c
        d d d d d
          e e e e
            f f f
              g g
                h	  */