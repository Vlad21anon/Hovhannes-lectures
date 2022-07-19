package lecturesHomework.L13;

public class E5 {
    public static void main(String[] args) {
        String[] agrsString = {"d","a","","","","4",""};
        voidCheacker(agrsString);
    }

    private static void voidCheacker(String[] aS) {
        int counter = 0;
        for (int i =0; i<aS.length; i++) {
            if (aS[i] == ""){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
