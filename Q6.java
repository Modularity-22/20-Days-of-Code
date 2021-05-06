import java.util.Scanner;
public class Q6{
	public static void main(String[] args){

		int arr[],num,size,uni=0;
		arr = new int[20];
		Scanner sc = new Scanner(System.in);

		size = sc.nextInt();
		for(int i = 0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}

		num = sc.nextInt();
		for(int i = 0;i<size;i++)
		{
			if(arr[i]==num)
			{
				uni++;
				System.out.println(i);
			}
		}
		if(uni==0)
		{
			System.out.println("-1");
		}
	}
}