package lecturesHomework.L15;

import java.util.Scanner;

public class E3 {
    static boolean credit=true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (credit) {
            System.out.println("Введите вашу ЗП:");
            int user = scanner.nextInt();
            System.out.println("Мы можем выдать вам кредит в "+user*5+" на 1 год. \nВы согласны?");

            areYouSure();
        }
    }

    private static void areYouSure() {
        Scanner scanner = new Scanner(System.in);
        String decidion = scanner.nextLine();
        if ("Да".equals(decidion)){
            System.out.println("Кредит выдан!");
            credit = false;
        }else if ("Нет".equals(decidion)) {
            System.out.println("До свидания.");
            credit = false;
        }else System.out.println("Давайте начнем заново.");
    }
}
