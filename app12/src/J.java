class J 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i=0;i<=10; i++ )
		{
			System.out.println("outer loop begin"+i);
			for (int j = 101;j<=105 ;j++ )
			{
				System.out.println("inner loop  bigin:"+i+","+j);
				System.out.println("inner loop  end:"+i+","+j);
			}
			System.out.println("outer loop end"+i);
		}
		System.out.println("main end");
	}
}
/*:\lab\app12\src>java -cp ../classes J
main begin
outer loop begin0
inner loop  bigin:0,101
inner loop  end:0,101
inner loop  bigin:0,102
inner loop  end:0,102
inner loop  bigin:0,103
inner loop  end:0,103
inner loop  bigin:0,104
inner loop  end:0,104
inner loop  bigin:0,105
inner loop  end:0,105
outer loop end0
outer loop begin1
inner loop  bigin:1,101
inner loop  end:1,101
inner loop  bigin:1,102
inner loop  end:1,102
inner loop  bigin:1,103
inner loop  end:1,103
inner loop  bigin:1,104
inner loop  end:1,104
inner loop  bigin:1,105
inner loop  end:1,105
outer loop end1
outer loop begin2
inner loop  bigin:2,101
inner loop  end:2,101
inner loop  bigin:2,102
inner loop  end:2,102
inner loop  bigin:2,103
inner loop  end:2,103
inner loop  bigin:2,104
inner loop  end:2,104
inner loop  bigin:2,105
inner loop  end:2,105
outer loop end2
outer loop begin3
inner loop  bigin:3,101
inner loop  end:3,101
inner loop  bigin:3,102
inner loop  end:3,102
inner loop  bigin:3,103
inner loop  end:3,103
inner loop  bigin:3,104
inner loop  end:3,104
inner loop  bigin:3,105
inner loop  end:3,105
outer loop end3
outer loop begin4
inner loop  bigin:4,101
inner loop  end:4,101
inner loop  bigin:4,102
inner loop  end:4,102
inner loop  bigin:4,103
inner loop  end:4,103
inner loop  bigin:4,104
inner loop  end:4,104
inner loop  bigin:4,105
inner loop  end:4,105
outer loop end4
outer loop begin5
inner loop  bigin:5,101
inner loop  end:5,101
inner loop  bigin:5,102
inner loop  end:5,102
inner loop  bigin:5,103
inner loop  end:5,103
inner loop  bigin:5,104
inner loop  end:5,104
inner loop  bigin:5,105
inner loop  end:5,105
outer loop end5
outer loop begin6
inner loop  bigin:6,101
inner loop  end:6,101
inner loop  bigin:6,102
inner loop  end:6,102
inner loop  bigin:6,103
inner loop  end:6,103
inner loop  bigin:6,104
inner loop  end:6,104
inner loop  bigin:6,105
inner loop  end:6,105
outer loop end6
outer loop begin7
inner loop  bigin:7,101
inner loop  end:7,101
inner loop  bigin:7,102
inner loop  end:7,102
inner loop  bigin:7,103
inner loop  end:7,103
inner loop  bigin:7,104
inner loop  end:7,104
inner loop  bigin:7,105
inner loop  end:7,105
outer loop end7
outer loop begin8
inner loop  bigin:8,101
inner loop  end:8,101
inner loop  bigin:8,102
inner loop  end:8,102
inner loop  bigin:8,103
inner loop  end:8,103
inner loop  bigin:8,104
inner loop  end:8,104
inner loop  bigin:8,105
inner loop  end:8,105
outer loop end8
outer loop begin9
inner loop  bigin:9,101
inner loop  end:9,101
inner loop  bigin:9,102
inner loop  end:9,102
inner loop  bigin:9,103
inner loop  end:9,103
inner loop  bigin:9,104
inner loop  end:9,104
inner loop  bigin:9,105
inner loop  end:9,105
outer loop end9
outer loop begin10
inner loop  bigin:10,101
inner loop  end:10,101
inner loop  bigin:10,102
inner loop  end:10,102
inner loop  bigin:10,103
inner loop  end:10,103
inner loop  bigin:10,104
inner loop  end:10,104
inner loop  bigin:10,105
inner loop  end:10,105
outer loop end10
main end*/