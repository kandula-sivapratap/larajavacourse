class L 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i=0;i<=2; i++ )
		{
			System.out.println("outer loop begin"+i+","+j);
			if (j==103)
			{ 
				break;
			}
				System.out.println("inner loop  end:"+i+","+j);
			}
			System.out.println("outer loop end"+i);
		}

		System.out.println("main end");
	}
