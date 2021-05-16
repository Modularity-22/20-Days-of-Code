import java.util.Scanner;
public class Q19{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);	    
    String str;
    System.out.println("Enter the string");
    str = scan.next();
    int firstIndex = firstelement(str);
    if (firstIndex == -1)
       System.out.println("There is no such character "+ firstIndex);
    else
       System.out.println("First non-repeating character is at index:  "+ firstIndex);

		

	}
	public static int firstelement(String str) {
    int[] fi = new int [256]; 
 
    for(int i = 0; i<256; i++)
        fi[i] = -1;
 
    for(int i = 0; i<str.length(); i++) {
        if(fi[str.charAt(i)] == -1) {
            fi[str.charAt(i)] = i;
        }else {
            fi[str.charAt(i)] = -2;
        }
    }
 
    int res =  Integer.MAX_VALUE;
 
    for(int i = 0; i<256; i++) {
 
        if(fi[i] >= 0)
            res = Math.min(res, fi[i]);
    }
     
    if(res ==  Integer.MAX_VALUE) return -1;
    else return res;
}
}

     


