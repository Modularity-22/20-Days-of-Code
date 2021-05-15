import java.util.Scanner;
public class Q18{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int arr[],size,temp,num;
		arr = new int[20];
        System.out.print("Enter Array Size  ");  
        size = scan.nextInt();  
        int count = size-1;
        System.out.print("Enter Array Elements  ");  
        for(int i=0; i<size; i++)  
        {  
            arr[i] = scan.nextInt();  
        }
        System.out.println("Enter the Element you want to shift right");
        num = scan.nextInt();
        for(int i = 0; i<count; i++ )
        {
            if(arr[i]==num)
            {
                arr[i]=arr[count];
                arr[count]=num;
                count--;

            }
        }
        System.out.println("Final Array");  
        for(int i=0; i<size; i++)  
        {
            System.out.print(arr[i]+" ");
        }
        
  	}
}
