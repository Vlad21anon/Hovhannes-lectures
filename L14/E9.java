package lecturesHomework.L14;

public class E9 {
    public static void main(String[] args) {
        int[] list = {1,2,3,5,6,8};
        summElements(list);
    }

    private static void summElements(int[] list) {
        int[] answList = new int[list.length];
        answList[list.length-1] = list[list.length-1];
        for (int i =0; i< list.length-1; i++) {
            answList[i] = list[i] + list[i+1];
        }

        for (int i =0; i< list.length; i++) {
            System.out.println(answList[i]);}
    }
}
