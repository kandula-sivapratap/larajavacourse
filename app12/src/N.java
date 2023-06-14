class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		loop1:
		for (int i=1;i<=2; i++ )
		{
			System.out.println("outer loop begin"+i);
			loop2:
			for (int j = 100;j<=104 ;j++ )
			{
				System.out.println("inner loop  bigin:"+i+","+j);
				if (j==103)
				{
					continue loop1;
				}
				System.out.println("inner loop  end:"+i+","+j);
			}
			System.out.println("outer loop end"+i);
		}
		System.out.println("main end");
	}
}



/*D:\lab\app12\src>java -cp ../classes N
main begin
outer loop begin1
inner loop  bigin:1,100
inner loop  end:1,100
inner loop  bigin:1,101
inner loop  end:1,101
inner loop  bigin:1,102
outer loop end1
outer loop begin2
inner loop  bigin:2,100
inner loop  end:2,100
inner loop  bigin:2,101
inner loop  end:2,101
inner loop  bigin:2,102
outer loop end2
main end*/



/*D:\lab\app12\src>java -cp ../classes N
main begin
outer loop begin1
inner loop  bigin:1,100
inner loop  end:1,100
inner loop  bigin:1,101
inner loop  end:1,101
inner loop  bigin:1,102
inner loop  end:1,102
outer loop end1
outer loop begin2
inner loop  bigin:2,100
inner loop  end:2,100
inner loop  bigin:2,101
inner loop  end:2,101
inner loop  bigin:2,102
inner loop  end:2,102
outer loop end2
main end*/