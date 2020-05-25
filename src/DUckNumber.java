public class DUckNumber {

    public static void main(String[] args) {

        int var = 7769;

        Integer number = 7400;



        String str=  String.valueOf(var);

        if(!str.startsWith("0") && str.contains("0")) {
            System.out.println("dUCK nUMBER");
        }
        else
        {
            System.out.println("nOT A dUCK nUMBER");
        }
    }
}
