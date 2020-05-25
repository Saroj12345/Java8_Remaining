import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrSum {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 4, 5};

      /*  int sum =1;
        for(int i=0;i<arr.length;i++) {
            sum = sum*arr[i];
        }

        int finalArray[] = new int[arr.length];

        for(int i=0;i<arr.length;i++) {
            finalArray[i] = sum/arr[i];
        }

        IntStream.of(finalArray).forEach(System.out::println);*/


       // System.out.println(IntStream.of(arr).reduce(1,(a,b) -> (a*b)));

        int sum =1;
        int finalArray[] = new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++) {

            for(int j=0;j<arr.length;j++) {

                if(i!=j) {
                   sum = sum * arr[j];
                   //finalArray[k++] = sum;
                   //System.out.println(sum);
                }
            }
            finalArray[i] = sum;
            sum=1;
        }


        for(int a : finalArray) {
            System.out.println(a);
        }
    }
}
