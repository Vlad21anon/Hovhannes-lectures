package lecturesHomework.L14;

public class E5_No {
    public static void main(String[] args) {
        int[] list= {1,1,3,2,2,2,1};
        howDuplicates(list);
    }

    private static void howDuplicates(int[] list) {
        int magicConst = Integer.MIN_VALUE;
        int counter1 = 0;
        for (int i = 0; i < Integer.MAX_VALUE+1; i++) {
            System.out.println("ada");
            magicConst +=i;

            System.out.println("adad");
            for (int j = 0; j < list.length; j++) {
                if (magicConst == list[j]){
                    counter1 = list.length+1;
                    break;
                }else if (magicConst != list[j] && counter1 == list.length){
                    System.out.println("Числа как" + magicConst + " нет");
                    magicConst =magicConst;

                }
                counter1++;
            }
        }


        int counter = 0;
        for (int i1 = 0; i1 < list.length; i1++) {
            for (int i2 = 0; i2 < list.length; i2++) {
                if (list[i1] == list[i2] && counter>0){
                    counter+=1;
                    list[i2] = magicConst;
                }else if (list[i1] == list[i2]){
                    counter+=1;
                }
            }
            if (list[i1] != magicConst) {// 9999999 Не работает
                System.out.println(list[i1] + ":" + counter);
            }
            counter = 0;
        }
    }
}
