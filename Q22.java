import java.util.Scanner;
public class Q22 {
    public static void main(String[] args){
        String var;
        Scanner sc = new Scanner(System.in);
        var = sc.next();
        System.out.println(reverseOnlyLetters(var));

    }
    public static String reverseOnlyLetters(String S) {
        StringBuilder ans = new StringBuilder();
        int j = S.length() - 1;
        for (int i = 0; i < S.length(); ++i) {
            if (Character.isLetter(S.charAt(i))) {
                while (!Character.isLetter(S.charAt(j)))
                    j--;
                ans.append(S.charAt(j--));
            } else {
                ans.append(S.charAt(i));
            }
        }

        return ans.toString();
    }
}