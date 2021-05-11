import java.util.Scanner;
public class Q14{
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
        System.out.println("Maximum repeating element is: " + maxRepeating(arr,size));


    }

    static int maxRepeating(int arr[],int n)
    {
        int k=n;
        for(int i=0;i<n;i++)
            arr[(arr[i]%k)]+= k;
 
        int max=arr[0],result=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
                result = i;
            }
        }
        return result;
    }
}