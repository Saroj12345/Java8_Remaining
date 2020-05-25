import java.util.HashMap;
import java.util.Map;

public class ArrayExample {

    public static void main(String[] args) {

        int[] intArray = new int[]{1,2,5,5,7,7,7,8};

        Map<Integer,Integer> dataMap= new HashMap<>();
        for(int i=0;i<intArray.length;i++) {

            if(dataMap.containsKey(intArray[i])) {
                dataMap.put(intArray[i],dataMap.get(intArray[i])+1);
            }
            else {
                dataMap.put(intArray[i],1);
            }
        }

        dataMap.entrySet().stream()
                .filter(integerIntegerEntry -> integerIntegerEntry.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        //System.out.println(dataMap);



    }
}
