
public class Diffrent_Pattern {

	public static void main(String[] args) {
		
		Pattern8 ();
		
		
	

	}
	
/*
 
* 
* * 
* * * 
* * * * 
* * * * * 

	 */

	
	public static void Pattern1 ()
	
	{
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println("");
			
		}
		
	}
	
	
	/*
	 
	* * * * *
	* * * *
	* * *
	* *
	* 

		 */
	
	
public static void Pattern2 ()
	
	{
		for (int k=5;k>=1;k--)
		{
			for (int l=1;l<=k;l++)
			{
				System.out.print("* ");
			}
			
			System.out.println("");
			
		}
		
	}


/*

* * * * 
  * * *
    * *
      *  

	 */


public static void Pattern3 ()

{
	for (int k=0;k<=3;k++)
	{
		for (int l=1;l<=k;l++)
		{
			System.out.print("  ");
		}
		
		for (int l=3;l>=k;l--)
		{
			System.out.print("* ");
		}
		
		System.out.println("");
		
	}
}	
	
/*
      *
    * * *
  * * * * *
* * * * * * *

*/
	
	public static void Pattern4 ()

	{
		for (int k=1;k<=4;k++)
		{
			for (int l=3;l>=k;l--)
			{
				System.out.print("  ");
			}
			
			for (int m=1;m<=(2*k)-1;m++)
			{
				System.out.print("* ");
			}
			
			System.out.println("");
			
		}	
	
	
}
	
	
	public static void Pattern5 ()

	{
		for (int k=1;k<=6;k++)
		{
			for (int l=k;l>=1;l--)
			{
				System.out.print(l+ " ");
			}
			
			System.out.println("");
			
		}	
	
	
}
	
	
	
	public static void Pattern6 ()

	{
		for (int k=1;k<=6;k++)
		{
			for (int l=1;l<=k;l++)
			{
				System.out.print(l +" ");
			}
			
			for (int m=(k-1);m>=1;m--)
			{
				System.out.print(m+ " ");
			}
			
			System.out.println("");
			
		}	
	
	
}
	
	
	public static void Pattern7 ()

	{
		for (int k=1;k<=6;k++)
		{
			for (int l=1;l<=k;l++)
			{
				System.out.print(k+ " ");
			}
			
			System.out.println("");
			
		}	
	
	
}
	
public static void Pattern8 ()
	
	{
	int alphabet=65;
		for (int k=1;k<=5;k++)
		{
			
			for (int l=1;l<=k;l++)
			{
				System.out.print((char)alphabet);
				alphabet++;
			}
			
			System.out.println("");
			
		}
		
	}
	

}
