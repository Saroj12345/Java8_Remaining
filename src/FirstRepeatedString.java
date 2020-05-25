import java.util.*;

public class FirstRepeatedString {

    public static void main(String[] args) {

        String[] strArray = {"Saroj","Uday","Luv","Manoj","Uday","Rakesh","Manoj","Luv"};

        Map<String,Integer> dataMap= new HashMap<>();

        //char[] charArray = string.toCharArray();
        int count =0;
        for(int i=0;i<strArray.length;i++) {

            if(dataMap.containsKey(strArray[i])) {
                dataMap.put(strArray[i],dataMap.get(strArray[i])+1);
            }
            else {
                dataMap.put(strArray[i],1);
            }
        }
        //System.out.println(dataMap);

        System.out.println(dataMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).map(Map.Entry::getKey).findFirst().get());
    }
}
