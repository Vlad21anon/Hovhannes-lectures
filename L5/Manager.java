package L5;

public class Manager {
    // Строка Manager
    public static void manager(String hrText) {
        boolean everythingIsGood = true;
        String text2 = hrText +
            "Manager: Я проведу вас в кабинет\n";
        if (everythingIsGood)
            Interviewer.interviewer(text2);
        else{
            text2 +="Всё пошло не по плану..\n";
            Main.print(text2);
            return;
        }
    }
}