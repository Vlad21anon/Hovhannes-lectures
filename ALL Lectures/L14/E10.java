package lecturesHomework.L14;

public class E10 {
    public static void main(String[] args) {
        int[] list = {1,2,3,10,8,16,8};
        sumElems(list);
    }

    private static void sumElems(int[] list) {
        if (list.length%2 == 0) {
            int[] answList = new int[list.length/2];
            funList(list,answList);
        }else {
            int[] answList = new int[list.length / 2 +1];
            answList[answList.length-1] = list[list.length/2];
            funList(list,answList);
        }
    }

    private static void funList(int[] list, int[] answList) {
        for (int i = 0; i < list.length / 2; i++) {
            answList[i] = list[i] + list[list.length - i - 1];
        }
        for (int i : answList) { // Нет среднего элемента
            System.out.println(i);
        }
    }
}
