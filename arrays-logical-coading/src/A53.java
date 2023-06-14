import java.util.Arrays;
class A53
{
	public static void main(String[] args) 
	{
		int e[]={10,5,13,16,4,7,20,18};
		System.out.println("Intial");
		for (int i=0;i<e.length ;i++ )
		{
			System.out.print(e[i]+" ");
		}
		System.out.println();
		System.out.println("Final");
		//int temp1=e[0];
		//e[0]=e[e.length-1];
		//e[e.length-1]=temp1;
		for (int i=0;i<e.length-1 ;i+=2 )
		{
			int temp1=e[i];
		e[i]=e[i+1];
		e[i+1]=temp1;
			
		}
		System.out.println("final"+Arrays.toString(e));
		
		
	}
}