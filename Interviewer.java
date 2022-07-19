package variables;

public class Interviewer {
    public static void interviewer(String hrText) {
        Integer years = 30;
        Integer expJavaYears = 5;
        Integer expKotlinYears = 3;
        //Текст:
        String text3 = hrText + "Interviewer: Здравствуйте.\n";
        text3 += "Interviewer: Расскажите про себя, ваш опыт\n";
        text3 +=Main.NAME + ": Мне " + years + " лет\n";
        text3 +=Main.NAME + ": Мой опыт разработки в джаве: " + expJavaYears + "\n";
        text3 +=Main.NAME + ": Мой опыт разработки в котлин: " + expKotlinYears + "\n";
        if (expJavaYears <= 2) {
            text3 +="Interviewer: " + Main.NAME + ", вы недостаточно опытны в джаве, мы набираем от 3х лет ";
            Main.print(text3);
        }
        else if (expKotlinYears <= 2) {
            text3 +="Interviewer: " + Main.NAME + ", вы недостаточно опытны в котлин, мы набираем от 5х лет";
            Main.print(text3);
        }
        else
            Hr.hrAnswer(text3);
    }
}

