import java.util.Arrays;
class A64
{
	public static void main(String[] args) 
	{
		int e[]={10,5,13,16,4,7,20,18};
		System.out.println("Intial"+Arrays.toString(e));
		
		int temp1=e[e.length-1];
		int temp2=e[e.length-2];
		e[e.length-1]=e[0];
		e[e.length-2]=e[1];
		

		for (int i=e.length-3;i >=0;i-- )
		{
			e[i+2]=e[i];
			
		}
		e[0]=temp1;
		e[1]=temp2;
		System.out.println("final"+Arrays.toString(e));
		
		
	}
}