import java.util.Scanner;
public class Q12{
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
        Uni(arr,size);     


    }
    public static void Uni(int[] arr,int n)
    {
        int sum =0;
        for(int i = 0;i<n;i++)
        {
            sum = (sum^arr[i]);
        }

        sum = (sum&-sum);

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0;i<arr.length;i++)
        {
            if((arr[i]&sum) > 0)
            {
                sum1 = (sum1^arr[i]);
            }
            else
            {
                sum2 = (sum2^arr[i]);
            }
        }
        System.out.println("The elements are "+sum1+" and "+sum2);
    }
}
