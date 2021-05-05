public class  Q4
{public static void main(String[] args)
    {
      for(int i=1;i<=8;i++)
      {
        for(int j=0;j<8;j++)
        {
          if(j<8-i)
            System.out.print("  ");
          else
            System.out.print("*");
        }
        System.out.println();
      }    

    	for(int i=0;i<8;i++)
      {
        for(int j=0;j<8;j++)
          {
            if(j<i)
              System.out.print("  ");
            else
              System.out.print("*");
 
          }
		    System.out.println();
	    }                       
    }
}