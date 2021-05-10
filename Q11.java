import java.util.Scanner;
public class Q11{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[],size;
		array = new int[20];
        System.out.print("Enter Array Size  ");  
        size = scan.nextInt();  
        System.out.print("Enter Array Elements  ");  
        for(int i=0; i<size; i++)  
        {  
            array[i] = scan.nextInt();  
        }
        System.out.println("Before");
        for (int i = 0; i<size; i++) 
        {
            System.out.print(array[i] + " ");
        }

        int start = 0;
        int end = size - 1;
        while (start < end) {
        	int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;

            end--;
        }
        System.out.println();

        System.out.println("After");
        for (int i = 0; i<size; i++) 
        {
            System.out.print(array[i] + " ");
        }
    }
}