import java.util.Scanner;
public class Q16{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int arr[],size;
		int m = 1;
		arr = new int[20];
        System.out.print("Enter Array Size  ");  
        size = scan.nextInt();  
        System.out.print("Enter Array Elements  ");  
        for(int i=0; i<size; i++)  
        {  
            arr[i] = scan.nextInt();  
        }
       
        for(int i=0;i<size;i++)
        {
        	if(arr[i+1]!=arr[i]+1)
        	{
        		m = arr[i]+1;
        		break;
        	}
        	
        }
        System.out.println("The missing element was " + m);
  	}
}
