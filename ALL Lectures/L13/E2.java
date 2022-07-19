package lecturesHomework.L13;

public class E2 {
    public static void main(String[] args) {
        int[] values = {1,2,3,6,8};
        multiplyValues(values);
    }

    private static void multiplyValues(int[] values) {
        int result = 1;
        for (int i = 0; i < values.length; i++) {
            result *= values[i];
        }
        System.out.println(result);
    }
}
