import sun.applet.resources.MsgAppletViewer;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapCompareByValue {

    public static void main(String[] args) {

        Map<Integer,String> dataMap = new HashMap<>();

        dataMap.put(1,"Saroj");
        dataMap.put(2,"Sahoo");
        dataMap.put(3,"Shivam");
        dataMap.put(4,"Shiv");
        dataMap.put(5,"AAA");


        //new HashMapCompareByValue().filterMap();

  dataMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        //System.out.println(x);


    }


}
