import java.util.Scanner;
public class Q7{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int arr[],min,max,size;
		arr = new int[20];
		System.out.println("Enter the number of element you want to enter in the array");
		size = sc.nextInt();
		for(int i = 0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		min = arr[0];
		max = arr[0];
		for(int i = 0;i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("min: "+min);
		System.out.println("max: "+max);

	}
}