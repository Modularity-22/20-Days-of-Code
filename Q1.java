import java.util.Scanner;
public class Q1{
	public static void main(String[] args){

		for(int i=1;i<=150;i++)
		{
			if(i%5==0)
			{
				if(i%7==0)
				{
					System.out.println("TIPTOP");
				}
				else
				{
					System.out.println("TIP");
				}				
			}
			else if(i%7==0)
			{
				System.out.println("TOP");
			}
			else
			{
				System.out.println(i);
			}
			
		}


	}
}