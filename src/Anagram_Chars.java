import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram_Chars {

    public static void main(String[] args) {

        stringAnagram(Arrays.asList("heater", "cold", "clod", "reheat", "docl"), Arrays.asList("codl", "heater", "abcd"));
    }

    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        List<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < query.size(); i++) {
            int count = 0;
            String s1 = query.get(i);
            char[] chArray1 = s1.toCharArray();
            for (int j = 0; j < dictionary.size(); j++) {
                String s2 = dictionary.get(j);
                char[] charArry2 = s2.toCharArray();
                Arrays.sort(chArray1);
                Arrays.sort(charArry2);
                if (Arrays.equals(chArray1, charArry2)) {
                    count++;
                }
            }
            dataList.add(count);
        }

        System.out.println(dataList);
        return dataList;


    }

}
