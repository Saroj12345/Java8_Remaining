import java.util.HashSet;
import java.util.Set;

public class IntegerPermutation {

    static Set<String> hashSet = new HashSet<>();

    private static void printPermutation(String str, String ans) {
        // If string is empty
        if (str.length() == 0) {
            hashSet.add(ans);
            //System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recurvise call
            printPermutation(ros, ans + ch);
        }
       //System.out.println(hashSet);
    }

    public static void main(String[] args) {
        String str = "3175";
        printPermutation(str,"");
        System.out.println(hashSet);
       //hashSet.forEach(s -> System.out.println(s));
    }
}
