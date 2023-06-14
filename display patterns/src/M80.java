class M80
{
	public static void main(String[] args) 
	{	
		for(char i='V';i>='P';i--)
		{
			for(int j='V';j>=i;j--)
			{
				System.out.print("  ");
			}
			for(char k='P';k<=i;k++)
			{
				System.out.print(k+" ");
				}
				System.out.println();
			}
		
	}

}


/*
P Q R S T U V
   P Q R S T U
      P Q R S T 
         P Q R S
            P Q R
               P Q
                  P

D:\logicalcoding\app1\src>java -cp ../classes M80
  P Q R S T U V
    P Q R S T U
       P Q R S T
         P Q R S
            P Q R
               P Q
                  P	  */