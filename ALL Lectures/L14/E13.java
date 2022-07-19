package lecturesHomework.L14;

public class E13 {
    public static void main(String[] args) {
        int[] list= {1,1,2,2,2,3,4,5};
        int[] list2= {1,2,2,9,2,3,4,5};
        multiplyItems(list,list2);
    }

    private static void multiplyItems(int[] list, int[] list2) {
        int[] answList = new int[list.length];
        for (int i = 0; i < answList.length; i++) {
            answList[i]= list[i]*list2[i];
        }
        for (int i = 0; i < answList.length; i++) {
            System.out.println(answList[i]);
        }
    }
}
