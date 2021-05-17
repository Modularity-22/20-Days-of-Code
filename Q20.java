import java.util.Scanner;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        
        else
        {int[] counter = new int[26];
    for (int i = 0; i < s.length(); i++) {
        counter[s.charAt(i) - 'a']++;
        counter[t.charAt(i) - 'a']--;
    }
    for (int count : counter) {
        if (count != 0) {
            return false;
        }
    }
         return true;
    }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a,b;
        a = sc.next();
        b = sc.next();
        if(isAnagram(a,b)==false)
            System.out.println("False");
        else
            System.out.println("True");

    }
}
