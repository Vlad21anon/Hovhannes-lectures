package lecturesHomework.L23.E1;

public class daysInMonth {
    public static void main(String[] args) {
        System.out.println(daysInMonthPrint(2024,"Март"));
    }

    private static int daysInMonthPrint(int year, String monthName) {
        switch (monthName) {
            case "Январь":
                return 31;
            case "Февраль":
                return year % 4 == 0 ? 29 : 28;
            case "Март":
                return 31;
            case "Апрель":
                return 30;
            case "Май":
                return 31;
            case "Июнь":
                return 30;
            case "Июль":
                return 31;
            case "Август":
                return 31;
            case "Сентяброь":
                return 30;
            case "Октябрь":
                return 31;
            case "Ноябрь":
                return 30;
            case "Декабрь":
                return 31;
        }



        return 0;
    }
}
