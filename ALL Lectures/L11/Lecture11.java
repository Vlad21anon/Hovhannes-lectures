package lecturesHomework;

public class Lecture11 {
    public static Integer counter = 0;//8
    public static Byte numbGamer = 1;//18
    public static Byte numbGamer2 = 1;//19
    public static void main(String[] args) {
        //region abc
        triangleIsExist(2,3,4);//1
        minNumOf(2,0,4,10);//2
        restDay(true,true);//3
        anglesHow(90,30,60);//4
        ageIsFit(16);//5
        whereToGo(12);//6
        classAntonOrDenis("Антон");//7
        //8
        counterRepeats();//8
        counterRepeats();//8
        counterRepeats();//8
        counterRepeats();//8
        counterRepeats();//8
        counterRepeats();//8

        oIceWaterVapor(1);//9
        lgbtTrue(false);//10
        strCheacker("abc","");//11
        urlCheack("http://dasd");//12
        mediumMark(1,2,3,4,5);//13
        fNameSname("Иван","Иванов");//14
        numCheacker(-10);//15
        borders4Cheacker(10,10,10,10); //16
        premiumUser(10,true);//17
        //18
        stepGamer("A2-A4");
        stepGamer("A7-A6");
        //endregion
        stepGamer2("A2-A4");
        stepGamer2("A2-A4");
        stepGamer2("A2-A4");
        stepGamer2("A2-A4");
        stepGamer2("A2-A4");
    }



    private static void stepGamer2(String step) { //ВТОРОЙ АРГУМЕНТ
        if (numbGamer2<=2) {
            numbGamer2++;
            print(step);
        }else if (numbGamer2==3) {
            numbGamer2 = 1;
            print("Ход второго игрока сделан!");
        }
    }



    private static void counterRepeats() {
        counter++;
        if (counter>=5) print("Лимит привышен!");
    }

    private static void stepGamer(String step) { //ВТОРОЙ АРГУМЕНТ
        if (numbGamer==1) {
            numbGamer = 2;
            print(step);
        }else if (numbGamer==2) {
            numbGamer = 1;
            print("Ход второго игрока сделан!");
        }
    }

    private static void premiumUser(int lect, boolean isUserPremium) {
        if (isUserPremium) print("Всё норм!");
        else if (!isUserPremium && lect==1) print("Всё норм");
        else print("Номер невалидный!");
    }

    private static void borders4Cheacker(int i, int i1, int i2, int i3) {
        if (i==i1 && i1==i2 && i2==i3) print("Квадрат");
        else if (i==i2 && i1==i3) print("Прямоугольник");
        else print("Четырехугольник");
    }

    private static int numCheacker(int i) {
        if (i < 0 ) {
            return i*-1;
        }else return i;
    }

    private static void fNameSname(String fn, String sn) {
        if (fn == "Иван" && sn == "Иванов"){
            print("КОМБО");
        }else if (fn == "Иван" || sn == "Иванов"){
            print("Нет");
        }else print("Здравствуй," +fn+ " " +sn);
    }

    private static void mediumMark(int i, int i1, int i2, int i3, int i4) {
        float medium = (i+i1+i2+i3+i4)/5;
        print(Float.toString(medium));
    }

    private static boolean urlCheack(String s) {
        if (s.startsWith("http://")) {
            print("true");
            return true;
        }
        else return false;
    }

    private static boolean strCheacker(String f1, String f2) {
        if (!f1.isEmpty() && !f2.isEmpty() && f2 == f1) {return true;}
        return false;
    }

    private static void lgbtTrue(boolean b) {
        if (b) print("совет вам да любовь");
        else print("Валите в США");
    }

    private static void oIceWaterVapor(int i) {
        if (i == 1) print("Лёд");
        else if (i == 2) print("Вода");
        else print("Пар");
    }


    private static void classAntonOrDenis(String name) {
        if (name == "Денис" || name == "Антон") {print("Добро пожаловать отсуда");}
        else print("Добро пожаловать");
    }

    private static void whereToGo(int i) {
        if (i>100){print("Иди подальше");}
        else if (i<6){print("Иди в детсад");}
        else if (i<17){print("Иди в школу");}
        //else if (i>100){print("Иди в колледж");}
        else if (i<24){print("Иди в универ");}
        else if (i<65){print("Иди на работу");}
        else {print("Иди в поликлинику");}
    }

    private static void ageIsFit(int age) {
        if (age>100) {print("Вы бот");}
        else if (age >= 18) {print("Контент получен");}
        else {print("Контент не получен");}

    }

    private static void anglesHow(int i1, int i2, int i3) {
        if (i1==90 || i2==90 || i3==90 ) {print("Прямоугольный");}
        else if (i1>90) {print("Тупоугольный");}
        else if (i1==60 && i2 == 60){print("Равносторонний");}
        else if (i1==i2){print("Равнобедреный");}
        else {print("Остроугольный");}
    }

    private static void restDay(boolean a1, boolean a2) {
        if (a1 && a2) {print("Будильника не будет");}
        else if (a1 || a2) {print("Будильника будет на 11:00");}
        else {print("Будильник на 6:00");}
    }

    private static void minNumOf(Integer i1,Integer i2,Integer i3,Integer i4) {
        if (i1 < i2 && i1 < i3 && i1 < i4 ) {print(i1.toString());}
        else if (i2 < i1 && i2 < i3 && i2 < i4 ) {print(i2.toString());}
        else if (i3 < i2 && i3 < i1 && i3 < i4 ) {print(i3.toString());}
        else {print(i4.toString());}
    }

    private static void triangleIsExist(int i1, int i2, int i3) {
        if (i1+i2>i3 && i1+i3>i2 && i2+i3>i1) {print("Существует");}
        else print("Не существует");
    }


    public static void print(String text) {
        System.out.println(text);
    }
}
