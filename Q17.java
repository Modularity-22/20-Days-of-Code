import java.util.Scanner;
public class Q17{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int arr[],size,temp;
		arr = new int[20];
        System.out.print("Enter Array Size  ");  
        size = scan.nextInt();  
        System.out.print("Enter Array Elements  ");  
        for(int i=0; i<size; i++)  
        {  
            arr[i] = scan.nextInt();  
        }
        for(int i = 0; i<size; i++ )
        {
            for(int j = i+1; j<size; j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("Third smallest number is "+arr[2]);
        System.out.println("Third largest number is "+arr[size-3]);
  	}
}
