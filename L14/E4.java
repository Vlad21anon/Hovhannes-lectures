package lecturesHomework.L14;

public class E4 {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,0};
        listAnsw(list);
    }

    private static void listAnsw(int[] list) {
        int minV = 0;
        int maxV = 0;
        for (int number: list){
            if (number< minV) {
                minV = number;
            }else if (number>maxV){
                maxV = number;
            }
        }
        System.out.println(maxV-minV);



    }

}
