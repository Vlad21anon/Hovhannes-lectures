package lecturesHomework.L13;

public class E6 {
    public static void main(String[] args) {
        int[] listNum = {1,2,3,4,5,6};
        arithmeticProgressionTest(listNum);

    }

    private static void arithmeticProgressionTest(int[] list) {
        int step = list[1] - list[0];
        boolean trust = true;
        for (int i = 1; i< list.length-1; i++){
            if (list[i]+step != list[i+1]){
                trust = false;
            }
        }
        if (trust){System.out.println("Это арифметическая прогрессия");}
        else {System.out.println("Это не арифметическая прогрессия");}
    }
}
