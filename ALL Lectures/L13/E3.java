package lecturesHomework.L13;

public class E3 {
    public static void main(String[] args) {
        int[] arguments = {1,2,4,-3,0,10};
        minusArgs(arguments);
    }

    private static void minusArgs(int[] args) {
        int counter = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
