package lecturesHomework.L14;


public class E12_No {
    public static void main(String[] args) {
        int[] list= {1,1,2,2,2,3,4,5};
        withoutDuplicates(list);
    }

    private static void withoutDuplicates(int[] list) {
        boolean firstComplete = true;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i]==list[j] && firstComplete){
                    firstComplete = false;
                }else if (list[i]==list[j]) {
                    list[i] = 999999;
                }
            }
            firstComplete = true;
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 999999) {
                System.out.println(list[i]);
            }
        }

    }


}
