import java.util.Scanner;
public class Q2{
	public static void main(String[] args){
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		str = sc.next();
		if(str.startsWith("dav"))
		{
			if(str.endsWith("chi"))
			{
				System.out.println("correct code");
			}
			else System.out.println("access denied");
		}
		else System.out.println("access denied");
	}
}
