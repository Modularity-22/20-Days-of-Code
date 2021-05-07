import java.util.Scanner;
public class Q8{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int arr[],size,num;
		arr = new int[20];
		System.out.println("Enter the number of element you want to enter in the array");
		size = sc.nextInt();
		for(int i = 0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		num = arr[0];
		for(int i=1;i<size;i++)
		{
			num=num^arr[i];
		}
		System.out.println("The element which is once in the array is "+num);

	}
}