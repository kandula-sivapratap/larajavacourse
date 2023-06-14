class G 
{
	public static void main(String[] args) 
	{
		if(false)
		{
		    System.out.println("from if inner if block");
        }
		else
		{
			if (true)
				if (false)
				{
					System.out.println("from inner if else block block");
			    }
			    else
				{
				System.out.println("from if  elseinner elseblock ");	
				}
				else
				{
				System.out.println("from inner else block block");	
				}
		}
          System.out.println("main end");
	}
}
