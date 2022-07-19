package lecturesHomework;

public class Lecture10 {
    public static void main(String[] args) {
        boolean isTodayFriday = true;
        boolean aLotOfMonay = true;

        barClass(isTodayFriday,aLotOfMonay);

        int monay = 400;
        int priceWhiskey = 600;
        int priceBeer = 300;
        whatToBuy(priceWhiskey,priceBeer,monay);
    }
    public static void barClass(boolean friday, boolean monay) {
        if (friday && monay) { print("Пошел в бар пить пиво"); }
        else if (friday && !monay) { print("Пошел в бар пить пиво с другом в долг"); }
        else { print("Пошел домой есть гречку"); }
    }

    private static void whatToBuy(int pW, int pB ,int monay) {
        if (monay-pW-pB>=0){ print("Купил и пиво и виски"); }
        else if (monay-pW >=0){ print("Купил виски"); }
        else if (monay-pB >=0){ print("Купил пиво"); }
        else { print("Ничего не купил"); }
    }


    public static void print(String text) {
        System.out.println(text);
    }
}
