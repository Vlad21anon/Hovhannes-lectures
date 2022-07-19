package lecturesHomework.L15;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int diff = num2-num1;
        int counter = 0;
        while (counter != 8) {
            counter++;
            int num3 = scanner.nextInt();
            if (num3-diff*counter != num2){
                System.out.println("Это не арифметическая прогрессия");
                break;}
        }
    }
}
