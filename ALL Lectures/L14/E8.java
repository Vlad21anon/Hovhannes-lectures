package lecturesHomework.L14;

public class E8 {
    public static void main(String[] args) {
        int[] list = {1,2,-2,-4,5};
        toPlussNums(list);
    }

    private static void toPlussNums(int[] list) {
        for (int i = 0; i<list.length; i++) {
            if (list[i]<0) {
                list[i]*=-1;
            }
        }
        for (int i = 0; i<list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
