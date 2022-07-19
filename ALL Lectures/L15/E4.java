package lecturesHomework.L15;

import java.util.Scanner;

public class E4 {
    static boolean isFinish =true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (isFinish) {
            System.out.println("Как вас зовут?");
            String visitorString = scanner.nextLine();
            if ("Джек".equals(visitorString)) {
                System.out.println("Вы нам не подходите, раз вас зовут Джек");
                break;
            }else if (!"Джек".equals(visitorString)) {
                System.out.println("Расскажите про ваш опыт, сколько лет вы работаете с джавой?");
                int visitorInt = scanner.nextInt();
                if (visitorInt >= 5) {
                    System.out.println("Это отлично! А сколько лет программируете на котлин?");
                    visitorInt = scanner.nextInt();
                    if (visitorInt>2){
                        System.out.println("Вы нам подходите. Мы можем предложить вам 3000$");
                        areYouSure();
                    }else if (visitorInt<2){
                        System.out.println("Вы нам подходите. Мы можем предложить вам 1500$");
                        areYouSure();
                    }
                }else if (visitorInt < 5){
                    System.out.println("Мы набирам только самых опытныз, до свидания");
                    isFinish = false;
                }
            }
        }
    }

    private static void areYouSure() {
        Scanner scanner = new Scanner(System.in);
        String visitorString = scanner.nextLine();
        if ("Согласен".equals(visitorString)) {
            System.out.println("Отлично!");
            isFinish = false;
        }else if (!"Согласен".equals(visitorString)){
            System.out.println("Тогда досвидания");
            isFinish = false;
        }
    }
}
