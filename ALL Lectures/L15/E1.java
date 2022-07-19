package lecturesHomework.L15;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (!"Даниил".equals(name)) {
            name = scanner.nextLine();
            if (!"Даниил".equals(name))
                System.out.println("Привет, "+ name);
        }
    }
}
