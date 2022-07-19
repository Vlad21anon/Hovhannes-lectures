package lecturesHomework.L14;

public class E7 {
    public static void main(String[] args) {
        String[] list = {"213","this","this","dasd","this"};
        printIndexThis(list);
    }

    private static void printIndexThis(String[] list) {
        boolean lock = true;
        for (int i = 0; i<list.length; i++){
            if (list[i] == "this" && lock) {
                System.out.print(i);
                lock = false;
            } else if (list[i] == "this") {
                System.out.print(","+i);}
        }
    }
}
