class  A
{
	A(int i)
	{
		this();
		System.out.println("A(int)");
	}
}

class T extends A
{
	T(int i)
	{
      System.out.println("T(int i)");            
	}
	
	public static void main(String[] args) 
	{
       T t1 = new T(90);
	   System.out.println("done");
	}
}
	  