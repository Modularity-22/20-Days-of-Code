import java.util.Scanner;
public class Q15{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int arr[][],size,sum1=0,sum2=0;
		arr = new int[20][20];
        System.out.print("Enter the size of the square matrix ");  
        size = scan.nextInt();  
        System.out.print("Enter Array Elements  ");  
        for(int i=0; i<size; i++)  
        {  
        	for(int j=0; j<size; j++)
        	{
        		arr[i][j] = scan.nextInt();
        	}
        }		
        for(int i=0; i<size; i++)  
        {  
        	for(int j=0; j<size; j++)
        	{
        		System.out.print(arr[i][j]+ " ");
        	}
        	System.out.println();
        }	
        for (int i=0; i<size; i++) 
        {
        	sum1 += arr[i][i];
            sum2 += arr[i][size-i-1];
        }
     
        System.out.println("Sum of First Diagonal is :" + sum1);
                                    
        System.out.println("Sum of Secondary Diagonal is:" + sum2);


	}
}