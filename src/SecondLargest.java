import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {

    public static void main(String[] args) {

        int[] numArray1 = new int[]{5,3,60,40,10};

        //List<Integer> array= Arrays.asList(numArray);

         List<Integer> array= new ArrayList<Integer>();
        for(Integer i : numArray1) {
            array.add(i);
        }
        List<Integer> numArray= Arrays.asList(5,3,60,40,10,40);

        System.out.println(numArray.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get());

    }
}
