import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {
        String A = "Helloji";
        String B= "hello";

        char[] charArray1= A.toUpperCase().toCharArray();
        char[] charArray2 = B.toUpperCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if(Arrays.equals(charArray1,charArray2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }


    }
}


