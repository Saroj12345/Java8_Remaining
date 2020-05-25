public class SrringExp {

    public static void main(String[] args) {

        //String s = "Saroj";
        //System.out.println(s.indexOf("z"));
        System.out.println(twoStrings("Hello","world"));
    }

    static String twoStrings(String s1, String s2) {

        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String flag = null;
        for(char c : alphabets.toCharArray()) {

            if(s1.indexOf(c) > -1 && s2.indexOf(c) > -1) {
                flag =  "YES";
            } else {
                flag=  "NO";
            }
        }

        return flag;

    }
}
