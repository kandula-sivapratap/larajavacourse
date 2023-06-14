class A50 
{
	public static void main(String[] args) 
	{
		int array[]={1,2,3,4,5,6,7,8};
		System.out.println("Intial");
		for (int i=0;i<=array.length/2 ;i++ )
		{
			System.out.print(array[i]+5);
		}
		System.out.println();
		System.out.println("Final");
		for (int i=array.length/2;i<array.length-1 ;i++ )
		{
			System.out.print(array[i]-10);
		}
		System.out.println("Done!");
	}
}