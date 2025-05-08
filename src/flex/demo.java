package flex;

public class demo {
	
	
	public void getdata(int a,int b) 
	{
		int c=a*b;
		int d=a+b;
		int e=a-b;
		int f=a/b;
		System.out.println(c +"\n"+""+d+"\n"+""+e+"\n"+f);
	}

	public void getdata(String a) 
	{
		System.out.println(a);
	}

	
	
	public static void main(String[] args)
	{
		
	 //demo d=new demo();
	 //d.getdata(1000,101);
	 //d.getdata("I am here");
	 //d.getdata("Now it's second time to be done ");
	 
	//int b[]=new int[5];
	
		// Singal Dimel Array
	 int b[]= {0,2,3,4,5};
	for(int i =0;i<b.length;i++)
	{
		//System.out.println(b[i]);
		
	}
	 
	
	//Singal Dimel Array
	
	int c[][]=new int[3][3];
	c[0][0]=1;
	c[0][1]=2;
	c[0][2]=3;
	
	c[1][0]=4;
	c[1][1]=5;
	c[1][2]=6;
	
	c[2][0]=7;
	c[2][1]=8;
	c[2][2]=9;
	
	//int d[][]= {{1,2,3},{4,5,6},{7,8,9}};
	
	for(int  j=0;j<3;j++)
		{
			{
				for (int k =0;k<3;k++)
			 
				{
			
					System.out.print(c[j][k]);
					System.out.print(" ");
				}		 
				System.out.println("  ");
			}
		}
	
	}
}
	
	
	


