package lecturesHomework.L14;

public class E3 {
    public static void main(String[] args) {
        firstFibbNums(10);
    }
    private static void firstFibbNums(int num) {
        int[] list = new int[num];
        list[0] = 0;
        list[1] = 1;
        for (int i = 2; i < num; i++) {
            list[i] = list[i-1] + list[i-2];
        }
        for (int i = 0; i < num; i++) {
            System.out.println(list[i]);
        }
    }
}
