import java.util.Scanner;
public class Q9{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

	   int arr1[],arr2[],arr3[],size,temp;
	   arr1 = new int[20];
	   arr2 = new int[20];
	   arr3 = new int[20];
	   System.out.print("Enter Array Size  ");  
       size = scan.nextInt();  
         
       System.out.print("Enter Array Elements  ");  
       for(int i=0; i<size; i++)  
       {  
           arr1[i] = scan.nextInt();  
       }
       for(int i=0; i<size; i++) //making 2 copies of array 
       {  
           arr2[i] = arr1[i];
           arr3[i] = arr1[i];
       } 
       // Selection Sort   
       for(int i=0; i<size; i++)  
       {
           for(int j=i+1; j<size; j++)  
           {
           	   	if(arr1[i] > arr1[j])  
                {
                	temp = arr1[i];  
                    arr1[i] = arr1[j];  
                    arr1[j] = temp;  
                }  
            }  
        }

        for(int i=0; i<size; ++i)
            System.out.print(arr1[i] + " ");
        System.out.println();

        // Insertion Sort
        for(int i=1;i<size;++i) 
        {
            int key = arr2[i];
            int j=i-1;
 
            
            while(j>=0 && arr2[j]>key) 
            {
                arr2[j+1] = arr2[j];
                j = j-1;
            }
            arr2[j+1] = key;
        }
        for(int i=0; i<size; ++i)
            System.out.print(arr2[i] + " ");
        System.out.println();

        //bubble sort
        for(int i=0;i<size-1;i++)
            for(int j=0;j<size-i-1;j++)
                if(arr3[j] > arr3[j+1])
                {
                    
                    temp = arr3[j];
                    arr3[j] = arr3[j+1];
                    arr3[j+1] = temp;
                }
        for(int i=0; i<size; ++i)
            System.out.print(arr3[i] + " ");
        System.out.println();               
	}
}


	