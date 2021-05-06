import java.util.Scanner;
public class Q5{
	public static void main(String[] args){
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		str = sc.next();
		boolean isFound = str.indexOf("in") !=-1? true: false;

		if(isFound==true)
		{
			if(str.startsWith("dav"))
		    {
		    	if(str.endsWith("chi"))
			    {
			    	System.out.println("correct accepted");
			    }
			    else System.out.println("invalid");
		    }
		    else System.out.println("invalid");
	    }
	    else System.out.println("invalid");
}
}