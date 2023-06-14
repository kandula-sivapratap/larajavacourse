import java.util.Arrays;
class A56
{
	public static void main(String[] args) 
	{
		int e[]={10,5,13,16,4,7,20,18};
		System.out.println("Intial"+Arrays.toString(e));
		//int temp1=e[0];
		//e[0]=e[e.length-1];
		//e[e.length-1]=temp1;
		for (int i=0;i<e.length;i++ )
		{
			e[i]=i*2;
			
		}
		System.out.println("final"+Arrays.toString(e));
		
		
	}
}