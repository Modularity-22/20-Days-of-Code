import java.util.Scanner;
public class Q13{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
		int arr[],size;
		arr = new int[20];
        System.out.print("Enter Array Size  ");  
        size = scan.nextInt();  
        System.out.print("Enter Array Elements  ");  
        for(int i=0; i<size; i++)  
        {  
            arr[i] = scan.nextInt();  
        }
    System.out.println("The number of distinct Elements is  "+unique(arr,size));		

	}
	static int unique(int arr[], int n)
    {
    	int res = 1;
 
        for (int i = 1; i < n; i++)
        {
        	int j = 0;
            for (j=0;j<i;j++)
            if (arr[i]==arr[j])
                break;
 
            if (i==j)
                res++;
        }
        return res;
    }

}

