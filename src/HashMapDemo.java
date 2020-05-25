import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {


        String string = "aaaabbcd";

        Map<Character,Integer> dataMap= new HashMap<>();

        char[] charArray = string.toCharArray();
        int count =0;
        for(int i=0;i<charArray.length;i++) {

            if(dataMap.containsKey(charArray[i])) {
                dataMap.put(charArray[i],dataMap.get(charArray[i])+1);
            }
            else {
                dataMap.put(charArray[i],1);
            }
        }
        System.out.println(dataMap);

        System.out.println(dataMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst().get());
    }
}
