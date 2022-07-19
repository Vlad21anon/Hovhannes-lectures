package lecturesHomework.L15;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter != 20) {
            int num = scanner.nextInt();
            counter++;
            if (num%5 == 0)
                System.out.println("Кратное 5");
        }
    }
}
