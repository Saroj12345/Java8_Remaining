public class MoveTheElementToRightIfZero {
    public static void main(String[] args) {


        int[] arr = new int[]{1, 0, 0, 3, 0, 5, 12};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        while(count < arr.length) {
            arr[count++] = 0;
        }

        //System.out.println(count);

        for(int i=0;i<count;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
