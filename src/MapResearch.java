import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapResearch {

    public static void main(String[] args) {
        Map<Integer,Integer> dataMap = new HashMap<>();
        dataMap.put(1,3);
        dataMap.put(2,4);
        dataMap.put(3,7);
        dataMap.put(4,9);

        System.out.println(dataMap);

        //dataMap.entrySet().stream().filter(integerStringEntry -> integerStringEntry.getValue()%2==0).mapToInt(Integer::intValue).sum();
    }

}
