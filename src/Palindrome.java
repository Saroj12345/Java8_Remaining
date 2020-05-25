import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean isPalindrome = checkPalindrome(A);
        if(isPalindrome) {
            System.out.println("yes");
        }

    }
    private static boolean checkPalindrome(String A) {
        int j=A.length()-1;
        char[] ch = A.toCharArray();
        for(int i=0;i<A.length();i++) {
            if(ch[i]!=ch[j]) {
                return false;
            }
            j--;
        }
        return true;
    }
}
