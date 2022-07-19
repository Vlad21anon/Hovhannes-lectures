package L5;

public class Hr {
    public static void hr() { // Строка Hr
        boolean coming = true;
        String text1 = "Hr: " +
                "Скоро придет на соеседование "
                + Main.NAME + "\n";
        if (coming) {
            text1 += Main.NAME + " пришел на собеседование\n";
            Manager.manager(text1);
        } else {
            text1 += "Не пришел.";
            Main.print(text1);
            return;
        }

    }

    public static void hrAnswer(String interviewerText) { // Ответ Hr
        if (Main.NAME == "Анатолий") {
            String text4 = interviewerText + "\nОн нам не подходит";
            Main.print(text4);
        }
        else if (Main.NAME == "Дмитрий") {
            String text4 = interviewerText
                    + "\nОн нам подходит";
            Main.print(text4);
        }
    }
}
