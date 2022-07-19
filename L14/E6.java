package lecturesHomework.L14;

public class E6 {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};
        reverseList(list);
    }

    private static void reverseList(int[] list) {
        int[] answlist = new int[list.length];
        for (int i =0; i<list.length; i++) {
            answlist[i] = list[list.length-i-1];
        }
        for (int i =0; i<list.length; i++) {
            System.out.println(answlist[i]);
        }//System.out.println(answlist);
    }
}
