import java.util.Arrays;
class A60
{
	public static void main(String[] args) 
	{
		int e[]={10,5,13,16,4,7,20,18};
		System.out.println("Intial"+Arrays.toString(e));
		int temp=e[0];
		//int temp2=e[0];
       // e[1]=e[e.length-2];
       // e[0]=e[e.length-1];
		for (int i=0;i<e.length-2;i++ )
		{
			e[i]=e[i+2];
         } 
		 e[e.length-2]=temp;

		System.out.println("final "+Arrays.toString(e));
		
		
	}
}