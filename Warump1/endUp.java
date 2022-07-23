package CodingBat.Warump1;

public class endUp {
    public static void main(String[] args) {
        System.out.println(endUp("dasdDAaaa"));
    }

    public static String endUp(String str) {
        if (str.length()<3) {
            return str.toUpperCase();
        }
        String s1 = str.substring(0,str.length()-3);
        String s2 = str.substring(str.length()-3,str.length());
        return s1 + s2.toUpperCase();
    }
}
