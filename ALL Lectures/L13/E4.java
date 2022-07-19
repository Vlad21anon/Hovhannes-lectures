package lecturesHomework.L13;

public class E4 {
    public static void main(String[] args) {
        int[] v = {1,2,3,4,51,1,3,1};
        numberInList(1,v);
    }

    private static void numberInList(int el, int[] list) {
        int counter = 0;
        for (int i = 0; i< list.length; i++){
            if (list[i] == el){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
