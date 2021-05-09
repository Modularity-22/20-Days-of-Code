import java.util.Scanner;
public class Q10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        RotateArray rotate = new RotateArray();
        int arr[],size,d;
        arr = new int[20];
        System.out.print("Enter Array Size  ");  
        size = scan.nextInt();  
        System.out.println("Enter the number of left Rotation ");
        d = scan.nextInt();
        System.out.print("Enter Array Elements  ");  
        for(int i=0; i<size; i++)  
        {  
            arr[i] = scan.nextInt();  
        }
        rotate.leftRotate(arr, d, size);
        rotate.printArray(arr, size);


    }
}

class RotateArray {
    
    void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
 
    void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }
 
    /* utility function to print an array */
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}
