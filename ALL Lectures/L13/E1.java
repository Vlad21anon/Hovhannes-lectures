package lecturesHomework.L13;

public class E1 {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,3,6,10,-15,0};
        minValue(values);
    }

    private static void minValue(int[] values) {
        int currentElement = 0;
        for (int i = 0; i<values.length; i++) {
            if (values[i] < currentElement){
                currentElement = values[i];
            }
        }
        System.out.println(currentElement);
    }
}
