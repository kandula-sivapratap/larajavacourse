import java.util.Arrays;
class A54
{
	public static void main(String[] args) 
	{
		int e[]={10,5,13,16,4,7,20,18};
		System.out.println("Intial"+Arrays.toString(e));
		//int temp1=e[0];
		//e[0]=e[e.length-1];
		//e[e.length-1]=temp1;
		for (int i=0;i<e.length/2;i++ )
		{
			int temp1=e[i];
			e[i]=e[e.length-i-1];
			e[e.length-i-1]=temp1;
			//System.out.print(temp1+" ");
			
		}
		System.out.println("final"+Arrays.toString(e));
		
		
	}
}