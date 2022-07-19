package lecturesHomework.L15;

import java.util.Scanner;

public class E6 {
//    private static final String[] COMMANDS = new String[] {
//            "!тг","!почта","!сенсей","!Выход"};
//    private static final String[] RESULT = new String[] {
//            "Vlad","+1234567890","ukadoV@gmail.com","Hovannes Asatryan"};

    public static void main(String[] args) {
        CommandAndResultE6addition commandAndResultE6addition =
                new CommandAndResultE6addition("command","resulte");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.nextLine();
            if ("!тг".equals(command)) {System.out.println("Vlad");}
            else if ("!тф".equals(command)) {System.out.println("+1234567890");}
            else if ("!почта".equals(command)) {System.out.println("ukadoV@gmail.com");}
            else if ("!сенсей".equals(command)) {System.out.println("Hovannes Asatryan");}
            else if ("!Выход".equals(command)){
                System.out.println("Выход!");
                break;
            } else {
                System.out.println("!тг \n!тф \n!почта \n!сенсей \n!Выход");
            }
        }
    }
}
