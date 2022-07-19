package lecturesHomework.L14;

public class E11 {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        listX2(list);
    }

    private static void listX2(int[] list) {
        int[] answerList = new int[list.length*2];
        for (int i = 0; i< list.length; i++) {
            answerList[i*2] =  list[i];
            answerList[i*2+1] = list[i];
        }
        for (int i = 0; i< answerList.length; i++) {
            System.out.println(answerList[i]);
        }
    }
}
