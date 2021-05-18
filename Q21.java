import java.util.Scanner;
public class Q21{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integer element in array");
        int arr[] = new int[5]; 
        int max,min,sum=0;
        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        min = arr[0];
        for(int i=0;i<5;i++)
        {
            sum +=arr[i];
            if(arr[i]>max)
                max = arr[i];
            else if(min>arr[i])
                min = arr[i];
        }
        System.out.print(sum-max +" ");
        System.out.print(sum-min);

    }
}