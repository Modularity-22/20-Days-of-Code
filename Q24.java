import java.util.Scanner;
public class Q24{
    static int pageCount(int n, int p) 
    {

        int tp = n / 2;
        int tpff = p / 2;
        int tpfb = tp - tpff;

        return Math.min(tpff,tpfb);

    }
	public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        System.out.println(pageCount(n, p));
        in.close();

	}
}